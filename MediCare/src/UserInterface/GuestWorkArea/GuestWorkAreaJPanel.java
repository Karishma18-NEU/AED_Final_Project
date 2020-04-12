/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GuestWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class GuestWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form GuestWorkAreaJPanel
     */
    public GuestWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
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
        btnTrustList = new javax.swing.JButton();
        btnJobApplication = new javax.swing.JButton();
        btnAgencySignup = new javax.swing.JButton();
        btnRaiseIssue = new javax.swing.JButton();
        btnHelpline = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnOldAgeHomeList = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Guest Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 27));

        btnTrustList.setText("Trust of EcoSystem");
        btnTrustList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrustListActionPerformed(evt);
            }
        });
        add(btnTrustList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 251, -1));

        btnJobApplication.setText("View Jobs");
        btnJobApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobApplicationActionPerformed(evt);
            }
        });
        add(btnJobApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 251, -1));

        btnAgencySignup.setText("Sign Up as Funding Agency");
        btnAgencySignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencySignupActionPerformed(evt);
            }
        });
        add(btnAgencySignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 251, -1));

        btnRaiseIssue.setText("Raise Issue");
        btnRaiseIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseIssueActionPerformed(evt);
            }
        });
        add(btnRaiseIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 251, -1));

        btnHelpline.setText("Helpline");
        btnHelpline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelplineActionPerformed(evt);
            }
        });
        add(btnHelpline, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 251, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnOldAgeHomeList.setText("Old Age Home of EcoSystem");
        btnOldAgeHomeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOldAgeHomeListActionPerformed(evt);
            }
        });
        add(btnOldAgeHomeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 251, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrustListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrustListActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnTrustListActionPerformed

    private void btnJobApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobApplicationActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ApplyForJobJPanel afjp = new ApplyForJobJPanel(userProcessContainer, system, dB4OUtil, null, "G");
        userProcessContainer.add("afjp", afjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnJobApplicationActionPerformed

    private void btnAgencySignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencySignupActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        FundingAgencySignUpJPanel fasujp = new FundingAgencySignUpJPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("fasujp", fasujp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnAgencySignupActionPerformed

    private void btnRaiseIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseIssueActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        IssueSignUpJPanel isjp = new IssueSignUpJPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("IssueSignUpJPanel", isjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnRaiseIssueActionPerformed

    private void btnHelplineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelplineActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnHelplineActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        cardLayout.previous(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOldAgeHomeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOldAgeHomeListActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_btnOldAgeHomeListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgencySignup;
    private javax.swing.JButton btnHelpline;
    private javax.swing.JButton btnJobApplication;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOldAgeHomeList;
    private javax.swing.JButton btnRaiseIssue;
    private javax.swing.JButton btnTrustList;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
