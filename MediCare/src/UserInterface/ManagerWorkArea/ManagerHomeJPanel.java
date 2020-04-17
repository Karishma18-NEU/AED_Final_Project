/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerWorkArea;

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
 * @author Karishma
 */
public class ManagerHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerHomeJPanel
     */
    private JPanel mainContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    
    public ManagerHomeJPanel(JPanel mainContainer,EcoSystem system, DB4OUtil dB4OUtil,UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.mainContainer = mainContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManagerWorkAreaJPanel mawajp = new ManagerWorkAreaJPanel(userProcessContainer,system,userAccount,organization, enterprise);
        userProcessContainer.add("ManagerWorkAreaJPanel",mawajp);
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

        splitPane.setBackground(new java.awt.Color(255, 255, 255));
        splitPane.setMaximumSize(new java.awt.Dimension(900, 900));
        splitPane.setMinimumSize(new java.awt.Dimension(900, 900));

        controlJPanel.setBackground(new java.awt.Color(255, 204, 255));
        controlJPanel.setMaximumSize(new java.awt.Dimension(200, 200));
        controlJPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        controlJPanel.setPreferredSize(new java.awt.Dimension(200, 200));

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWorkArea, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btnViewArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addGap(113, 113, 113)
                .addComponent(btnWorkArea)
                .addGap(55, 55, 55)
                .addComponent(btnViewArea)
                .addContainerGap(627, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setMaximumSize(new java.awt.Dimension(700, 700));
        userProcessContainer.setMinimumSize(new java.awt.Dimension(700, 700));
        userProcessContainer.setOpaque(false);
        userProcessContainer.setPreferredSize(new java.awt.Dimension(700, 700));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
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

        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManagerWorkAreaJPanel mawajp = new ManagerWorkAreaJPanel(userProcessContainer,system,userAccount,organization, enterprise);
        userProcessContainer.add("ManagerWorkAreaJPanel",mawajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkAreaActionPerformed

    private void btnViewAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAreaActionPerformed
        // TODO add your handling code here:
        
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        EmployeeViewAreaJPanel evajp = new EmployeeViewAreaJPanel(userProcessContainer, system, dB4OUtil, userAccount, organization, enterprise);
        userProcessContainer.add("evajp",evajp);
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
