/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmployeeViewArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.GuestWorkArea.RaiseIssueJPanel;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class EmployeeViewAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeViewAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    public EmployeeViewAreaJPanel(JPanel userProcessContainer, EcoSystem system, DB4OUtil dB4OUtil, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
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
        btnTrustList = new javax.swing.JButton();
        btnRaiseIssue = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnProjects = new javax.swing.JButton();
        btnHelpline = new javax.swing.JButton();
        btnViewResolved = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOldAgeHomeList = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrustList.setText("Trust of EcoSystem");
        btnTrustList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrustListActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrustList, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 115, 251, -1));

        btnRaiseIssue.setText("Raise Issue");
        btnRaiseIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseIssueActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaiseIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 251, -1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Area");
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 27));

        btnProjects.setText("Projects");
        btnProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectsActionPerformed(evt);
            }
        });
        jPanel1.add(btnProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, -1));

        btnHelpline.setText("Helpline");
        btnHelpline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelplineActionPerformed(evt);
            }
        });
        jPanel1.add(btnHelpline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 251, -1));

        btnViewResolved.setText("View Resolved Issue Statistics");
        btnViewResolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewResolvedActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewResolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 251, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, 160));

        btnOldAgeHomeList.setText("Old Age Home of EcoSystem");
        btnOldAgeHomeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOldAgeHomeListActionPerformed(evt);
            }
        });
        jPanel1.add(btnOldAgeHomeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 251, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrustListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrustListActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnTrustListActionPerformed

    private void btnRaiseIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseIssueActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();      
        RaiseIssueJPanel rijp = new RaiseIssueJPanel(userProcessContainer, userAccount, system); 
        userProcessContainer.add("rijp",rijp);
        cardLayout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnRaiseIssueActionPerformed

    private void btnProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectsActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ProjectViewJPanel pvjp = new ProjectViewJPanel(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("pvjp",pvjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnProjectsActionPerformed

    private void btnViewResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResolvedActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnViewResolvedActionPerformed

    private void btnOldAgeHomeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOldAgeHomeListActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOldAgeHomeListActionPerformed

    private void btnHelplineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelplineActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnHelplineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelpline;
    private javax.swing.JButton btnOldAgeHomeList;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnRaiseIssue;
    private javax.swing.JButton btnTrustList;
    private javax.swing.JButton btnViewResolved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
