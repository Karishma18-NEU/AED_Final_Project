/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ApplicantWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class ApplicantHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplicantHomeJPanel
     */
    private JPanel mainContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;

    public ApplicantHomeJPanel(JPanel mainContainer, EcoSystem system, DB4OUtil dB4OUtil, UserAccount userAccount) {
        initComponents();
        this.mainContainer = mainContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ApplicantWorkAreaJPanel awajp = new ApplicantWorkAreaJPanel(userProcessContainer, system, userAccount, dB4OUtil);
        userProcessContainer.add("ApplicantWorkAreaJPanel", awajp);
        cardLayout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnWorkArea = new javax.swing.JButton();
        btnViewArea = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new java.awt.CardLayout());

        splitPane.setBackground(new java.awt.Color(255, 255, 255));
        splitPane.setMaximumSize(new java.awt.Dimension(900, 900));
        splitPane.setMinimumSize(new java.awt.Dimension(900, 900));

        controlJPanel.setBackground(new java.awt.Color(255, 204, 255));
        controlJPanel.setMaximumSize(new java.awt.Dimension(200, 200));
        controlJPanel.setMinimumSize(new java.awt.Dimension(200, 200));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnWorkArea.setText("Work Area");
        btnWorkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkAreaActionPerformed(evt);
            }
        });

        btnViewArea.setText("View Area");
        btnViewArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(18, 18, 18))
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWorkArea, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btnViewArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLogout)
                .addGap(109, 109, 109)
                .addComponent(btnWorkArea)
                .addGap(55, 55, 55)
                .addComponent(btnViewArea)
                .addContainerGap(627, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setMaximumSize(new java.awt.Dimension(700, 700));
        userProcessContainer.setMinimumSize(new java.awt.Dimension(700, 700));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        add(splitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        CardLayout cardLayout = (CardLayout) mainContainer.getLayout();
        LoginJPanel ljp = new LoginJPanel(mainContainer, system, dB4OUtil);
        mainContainer.add("ljp", ljp);
        cardLayout.next(mainContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnWorkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkAreaActionPerformed
        // TODO add your handling code here:

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ApplicantWorkAreaJPanel awajp = new ApplicantWorkAreaJPanel(userProcessContainer, system, userAccount, dB4OUtil);
        userProcessContainer.add("ApplicantWorkAreaJPanel", awajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkAreaActionPerformed

    private void btnViewAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAreaActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ApplicantViewAreaJPanel avajp = new ApplicantViewAreaJPanel(userProcessContainer, system, dB4OUtil);
        userProcessContainer.add("avajp", avajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewArea;
    private javax.swing.JButton btnWorkArea;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
