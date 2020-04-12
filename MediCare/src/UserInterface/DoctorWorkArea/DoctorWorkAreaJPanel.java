/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkArea;

import UserInterface.CareTakerWorkArea.*;
import UserInterface.CoordinatorWorkArea.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Karishma
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
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

        btnManageChildren = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnViewChildren = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageChildren.setText("Manage Senior Patients");
        btnManageChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageChildrenActionPerformed(evt);
            }
        });
        add(btnManageChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 200, 30));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Doctor Work Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 270, 26));

        btnViewChildren.setText("View Senior Patients");
        btnViewChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChildrenActionPerformed(evt);
            }
        });
        add(btnViewChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageChildrenActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageTreatmentSeniorJPanel mtsj = new ManageTreatmentSeniorJPanel(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("OngoingProjectsJPanel", mtsj);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageChildrenActionPerformed

    private void btnViewChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChildrenActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewTreatmentSeniorJPanel vtsj = new ViewTreatmentSeniorJPanel(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("OngoingProjectsJPanel", vtsj);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewChildrenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageChildren;
    private javax.swing.JButton btnViewChildren;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
