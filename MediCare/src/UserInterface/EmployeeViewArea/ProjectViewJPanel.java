/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmployeeViewArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.City;
import Business.Network.Country;
import Business.Network.State;
import Business.Organization.Organization;
import Business.Project.Project;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shalini
 */
public class ProjectViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProjectViewJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;

    public ProjectViewJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        populateProjectTable();
    }
    public void populateProjectTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewProjects.getModel();
        if(enterprise.getEnterpriseType().getValue().equals("OldAgeHome")){
            model.setRowCount(0);
            String[] arrOfStr = enterprise.getName().split(" ", 2); 
            String ent = arrOfStr[0] + " Trust";
            for(Country network: system.getNetworkList()){
                            for(State s: network.getStateList()){
                                for(City c: s.getCityList()){
                                       //Step 2-a: Check against each enterprise
                                        for (Enterprise enter : c.getEnterpriseDirectory().getEnterpriseList()) {
                                            if(enter.getName().equals(ent)){
                                                for (Project project : enter.getProjectDirectory().getProjectList()) {
                                                    Object[] row = new Object[2];
                                                    //row[0] = project.getId();
                                                    row[0] = project;
                                                    row[1] = project.getBudget();
                                                    model.addRow(row);
                                                }
                                            }
                                        }
                                }
                            }
            }
        }
        else{
            model.setRowCount(0);
            for (Project project : enterprise.getProjectDirectory().getProjectList()) {
                Object[] row = new Object[2];
                //row[0] = project.getId();
                row[0] = project;
                row[1] = project.getBudget();
                model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewProjects = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblViewProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Budget"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewProjects);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 110, 470, 240));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Projects");
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 220, 26));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 91, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblViewProjects;
    // End of variables declaration//GEN-END:variables
}
