/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vardhana Bhatt
 */
public class OldAgeHomeAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OldAgeHomeAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public OldAgeHomeAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise,
            EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnPublishJobs = new javax.swing.JButton();
        btnManageJobApplications = new javax.swing.JButton();
        btnManageEmpUserAcc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Admin Work Area ");

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnPublishJobs.setText("Publish Jobs");
        btnPublishJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishJobsActionPerformed(evt);
            }
        });

        btnManageJobApplications.setText("Manage Job Applications");
        btnManageJobApplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageJobApplicationsActionPerformed(evt);
            }
        });

        btnManageEmpUserAcc.setText("Manage Employee User Account");
        btnManageEmpUserAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpUserAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublishJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageJobApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmpUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(btnManageOrganization)
                .addGap(45, 45, 45)
                .addComponent(btnPublishJobs)
                .addGap(45, 45, 45)
                .addComponent(btnManageJobApplications)
                .addGap(45, 45, 45)
                .addComponent(btnManageEmpUserAcc)
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeOrganizationJPanel mojp = new ManageOldAgeHomeOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("mojp", mojp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnPublishJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishJobsActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        PublishOldAgeHomeJobsJPanel pjjp = new PublishOldAgeHomeJobsJPanel(userProcessContainer, system.getJobDirectory(), userAccount, system);
        userProcessContainer.add("pjjp", pjjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnPublishJobsActionPerformed

    private void btnManageJobApplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageJobApplicationsActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeJobApplicationsJPanel mjajp = new ManageOldAgeHomeJobApplicationsJPanel(userProcessContainer, enterprise, system, userAccount);
        userProcessContainer.add("mjajp", mjajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageJobApplicationsActionPerformed

    private void btnManageEmpUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpUserAccActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeEmployeeUserAccountJPanel meuajp = new ManageOldAgeHomeEmployeeUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("meuajp", meuajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmpUserAccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmpUserAcc;
    private javax.swing.JButton btnManageJobApplications;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnPublishJobs;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
