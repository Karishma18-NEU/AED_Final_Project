/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Job.Job;
import Business.Organization.AdminOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.CampaignOrganization;
import Business.UserAccount.*;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vardhana Bhatt
 */
public class ManageJobApplicationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJobApplicationsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    
    public ManageJobApplicationsJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblJobWorkRequest.getModel();
        dtm.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof AdminOrganization) {
                for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof JobWorkRequest
                            && !workRequest.getStatus().equals("Accepted")
                            && !workRequest.getStatus().equals("Rejected")) {
                        Object row[] = new Object[4];
                        row[0] = workRequest.getSender();
                        row[1] = workRequest.getReceiver();
                        row[2] = workRequest;
                        row[3] = ((JobWorkRequest) workRequest).getJob();
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        tblScrollPane = new javax.swing.JScrollPane();
        tblJobWorkRequest = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Job Application");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 290, 26));

        tblJobWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Status", "Job Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJobWorkRequest.setMinimumSize(new java.awt.Dimension(375, 0));
        tblJobWorkRequest.getTableHeader().setReorderingAllowed(false);
        tblScrollPane.setViewportView(tblJobWorkRequest);

        add(tblScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 480, 178));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 100, -1));

        btnDelete.setText("Reject");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblJobWorkRequest.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to accept the applicant?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Job job = (Job) tblJobWorkRequest.getValueAt(selectedRow, 3);
                UserAccount ua = (UserAccount) tblJobWorkRequest.getValueAt(selectedRow, 0);
                WorkRequest workRequest = (WorkRequest) tblJobWorkRequest.getValueAt(selectedRow, 2);
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof ManagerOrganization && job.getName().equalsIgnoreCase("manager")) {

                        if (org.getEmployeeDirectory().getEmployeeList().size() == 1) {
                            JOptionPane.showMessageDialog(null, "Manager already exists", "Information", JOptionPane.INFORMATION_MESSAGE);
                            workRequest.setStatus("Rejected");
                            workRequest.setReceiver(userAccount);
                            populateTable();
                            return;
                        }

                        Employee employee = enterprise.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        org.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        enterprise.getEmployeeDirectory().getEmployeeList().add(employee);
                        enterprise.getJobDirectory().removeJob(job);
                        system.getJobDirectory().removeJob(job);

                        break;
                    } else if (org instanceof CampaignOrganization && job.getName().equalsIgnoreCase("Coordinator")) {
                        Employee employee = enterprise.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        org.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        enterprise.getEmployeeDirectory().getEmployeeList().add(employee);
                        break;
                    }
                }

                workRequest.setStatus("Accepted");
                workRequest.setReceiver(userAccount);

                populateTable();
                JOptionPane.showMessageDialog(null, "Employee created successfully", "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblJobWorkRequest.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to reject the application?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                WorkRequest workRequest = (WorkRequest) tblJobWorkRequest.getValueAt(selectedRow, 2);
                workRequest.setStatus("Rejected");
                workRequest.setReceiver(userAccount);
                populateTable();
                JOptionPane.showMessageDialog(null, "Job application deleted successfully", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblJobWorkRequest;
    private javax.swing.JScrollPane tblScrollPane;
    // End of variables declaration//GEN-END:variables
}
