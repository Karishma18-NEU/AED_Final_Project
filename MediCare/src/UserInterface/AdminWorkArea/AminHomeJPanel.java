/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EmployeeViewArea.EmployeeViewAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author Vardhana Bhatt
 */
public class AminHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AminHomeJPanel
     */
    private JPanel mainContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    
    
    
    public AminHomeJPanel() {
        initComponents();
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

        setLayout(new java.awt.CardLayout());

        controlJPanel.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewArea, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLogout)
                .addGap(124, 124, 124)
                .addComponent(btnWorkArea)
                .addGap(18, 18, 18)
                .addComponent(btnViewArea)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(userProcessContainer);

        add(splitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) mainContainer.getLayout();
        mainContainer.remove(this);
        cardLayout.previous(mainContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnWorkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkAreaActionPerformed
        // TODO add your handling code here:

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, userAccount, enterprise, system);
        userProcessContainer.add("awajp", awajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkAreaActionPerformed

    private void btnViewAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAreaActionPerformed
        // TODO add your handling code here:

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        EmployeeViewAreaJPanel evajp = new EmployeeViewAreaJPanel(userProcessContainer, system, dB4OUtil, userAccount, organization, enterprise);
        userProcessContainer.add("evajp", evajp);
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