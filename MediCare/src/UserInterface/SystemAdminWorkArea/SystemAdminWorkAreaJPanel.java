/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.City;
import Business.Network.Country;
import Business.Network.State;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Karishma
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    EcoSystem system;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTree();
    }

     public void populateTree(){
      
        DefaultTreeModel defaultTreeModel = (DefaultTreeModel) jTree.getModel();
        
        ArrayList<Country> networkList = system.getNetworkList();
        ArrayList<State> stateList;
        ArrayList<City> cityList;
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Country country;
        State state;
        City city;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Country");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) defaultTreeModel.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode countryNode;
        DefaultMutableTreeNode stateNode;
        DefaultMutableTreeNode cityNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0; i<networkList.size(); i++){
            country = networkList.get(i);
            countryNode = new DefaultMutableTreeNode(country.getName());
            networks.insert(countryNode,i); // country add
            
            stateList = country.getStateList();
            
            for(int j=0; j< stateList.size(); j++){
                
                state = stateList.get(j);
                stateNode = new DefaultMutableTreeNode(state.getName());
                countryNode.insert(stateNode, j);
                
                cityList = state.getCityList();
                    for(int k=0; k< cityList.size(); k++){
                         
                        city = cityList.get(k);
                        cityNode = new DefaultMutableTreeNode(city.getName());
                        stateNode.insert(cityNode, k);
                        
                        enterpriseList = city.getEnterpriseDirectory().getEnterpriseList();

                            for(int l=0 ; l< enterpriseList.size(); l++){

                            enterprise = enterpriseList.get(l);
                            enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                            cityNode.insert(enterpriseNode,l); 

                            organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                                for(int m=0; m< organizationList.size(); m++){

                                organization = organizationList.get(m);
                                organizationNode = new DefaultMutableTreeNode(organization.getName());
                                enterpriseNode.insert(organizationNode,m); 

                                }
                }
                }
                
                
            }
          
        }
      
        defaultTreeModel.reload();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        btnManageState = new javax.swing.JButton();
        btnManageCountry = new javax.swing.JButton();
        btnManageCity = new javax.swing.JButton();
        btnManageNGO = new javax.swing.JButton();
        btnManageNGOAdmin = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnManageRehabilation = new javax.swing.JButton();
        btnManageRehabilationAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree.setMaximumSize(new java.awt.Dimension(200, 200));
        jTree.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(jTree);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 283, 900));

        btnManageState.setText("Manage State Network");
        btnManageState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStateActionPerformed(evt);
            }
        });
        add(btnManageState, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 251, -1));

        btnManageCountry.setText("Manage Country Network");
        btnManageCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCountryActionPerformed(evt);
            }
        });
        add(btnManageCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 251, -1));

        btnManageCity.setText("Manage City Network");
        btnManageCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCityActionPerformed(evt);
            }
        });
        add(btnManageCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 251, -1));

        btnManageNGO.setText("Manage Trust");
        btnManageNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNGOActionPerformed(evt);
            }
        });
        add(btnManageNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 251, -1));

        btnManageNGOAdmin.setText("Manage Trust Admin");
        btnManageNGOAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNGOAdminActionPerformed(evt);
            }
        });
        add(btnManageNGOAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 251, -1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("System Admin Work Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 260, 26));

        btnManageRehabilation.setText("Manage OldAgeHome");
        btnManageRehabilation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRehabilationActionPerformed(evt);
            }
        });
        add(btnManageRehabilation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 251, -1));

        btnManageRehabilationAdmin.setText("Manage OldAgeHome Admin");
        btnManageRehabilationAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRehabilationAdminActionPerformed(evt);
            }
        });
        add(btnManageRehabilationAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 251, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCountryActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageCountryNetworkJPanel mcnjp = new ManageCountryNetworkJPanel(userProcessContainer,system);
        userProcessContainer.add("mcnjp",mcnjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCountryActionPerformed

    private void btnManageStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStateActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageStateNetworkJPanel msnjp = new ManageStateNetworkJPanel(userProcessContainer,system);
        userProcessContainer.add("msnjp",msnjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStateActionPerformed

    private void btnManageCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCityActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageCityNetworkJPanel mcnjp = new ManageCityNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("mcnjp",mcnjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCityActionPerformed

    private void btnManageNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNGOActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageTrustJPanel mngojp = new ManageTrustJPanel(userProcessContainer, system);
        userProcessContainer.add("mngojp",mngojp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNGOActionPerformed

    private void btnManageNGOAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNGOAdminActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageTrustAdminJPanel mngoajp = new ManageTrustAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("mngoajp",mngoajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNGOAdminActionPerformed

    private void btnManageRehabilationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRehabilationActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageRehabilationJPanel abcd = new ManageRehabilationJPanel(userProcessContainer, system);
        userProcessContainer.add("abcd",abcd);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRehabilationActionPerformed

    private void btnManageRehabilationAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRehabilationAdminActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeAdminJPanel abcde = new ManageOldAgeHomeAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("abcde",abcde);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRehabilationAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCity;
    private javax.swing.JButton btnManageCountry;
    private javax.swing.JButton btnManageNGO;
    private javax.swing.JButton btnManageNGOAdmin;
    private javax.swing.JButton btnManageRehabilation;
    private javax.swing.JButton btnManageRehabilationAdmin;
    private javax.swing.JButton btnManageState;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
