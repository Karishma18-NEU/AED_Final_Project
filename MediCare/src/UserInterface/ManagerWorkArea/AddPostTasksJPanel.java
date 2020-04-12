/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.CampaignOrganization;
import Business.Project.Project;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PostTaskWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Karishma
 */
public class AddPostTasksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPostTasksJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;

    public AddPostTasksJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        populateProjectName();

    }

    public void populateProjectName() {
        cbProjectName.removeAllItems();
        for (Project p : enterprise.getProjectDirectory().getProjectList()) {
            cbProjectName.addItem(p);
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

        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbProjectName = new javax.swing.JComboBox<>();
        btnPost = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTask = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NGO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel2.setText("Project:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        cbProjectName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProjectNameActionPerformed(evt);
            }
        });
        add(cbProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 149, -1));

        btnPost.setText("Post");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });
        add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 110, -1));

        jLabel3.setText("Task:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));
        add(txtTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 206, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 91, -1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Post a Task");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 270, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:

        String task = txtTask.getText();
        String regex = "^[a-z A-Z .]+$";
        Pattern namePattern = Pattern.compile(regex);
        Matcher nameMatcher = namePattern.matcher(task);

        if(task.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter text", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
        }
            if(!nameMatcher.matches()){
                 JOptionPane.showMessageDialog(null, "Invalid characters in task", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }

        PostTaskWorkRequest taskRequest = new PostTaskWorkRequest();
        taskRequest.setProject((Project) cbProjectName.getSelectedItem());
        taskRequest.setTask(task);
        taskRequest.setSender(userAccount);
        taskRequest.setStatus("Sent");

        Organization org = null;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof CampaignOrganization) {
                org = o;
                break;
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(taskRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(taskRequest);
            JOptionPane.showMessageDialog(null, "Task posted successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            txtTask.setText("");
        }
    }//GEN-LAST:event_btnPostActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PostTasksJPanel ptjp = (PostTasksJPanel) component;
        ptjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProjectNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPost;
    private javax.swing.JComboBox<Object> cbProjectName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtTask;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
