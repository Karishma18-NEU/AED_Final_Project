/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TrustEnterprise;
import Business.Enterprise.OldAgeHomeEnterprise;
import Business.Network.City;
import Business.Network.Country;
import Business.Network.State;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ConcurrentModificationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karishma
 */
public class ManageTrustJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTrustJPanel
     */
     private JPanel userProcessContainer;
     EcoSystem system;
    public ManageTrustJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateCountry();
        populateState();
        populateCity();
        populateEnterpriseType();
        populateTable();
    }

    private void populateCountry(){
        
         cbCountry.removeAllItems();
        
        for (Country c : system.getNetworkList()){
            cbCountry.addItem(c);
        }
        
    }
     
    private void populateState(){
        
        cbState.removeAllItems();
        if(cbCountry.getSelectedItem() != null){
           for (Country c : system.getNetworkList()){
            if(c.equals(cbCountry.getSelectedItem())){
                  for(State s: c.getStateList()){
                        cbState.addItem(s);
                    }
            }
                  
        }
        }
        
    }
    
    private void populateCity(){
        
         cbCity.removeAllItems();
        
        if (cbState.getSelectedItem() != null){
        for (Country c : system.getNetworkList()){
            for(State s: c.getStateList()){
                if(s.equals(cbState.getSelectedItem())){
                    for(City city :  s.getCityList()){
                    cbCity.addItem(city);
                     }
                }    
            }
        }
      }
        
    }
    
    public void populateEnterpriseType(){
        cbEnterpriseType.removeAllItems();
          for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if(type.getValue().equals("Trust")){
                cbEnterpriseType.addItem(type);
            }
        }
    }
     
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblTRUST.getModel();
        dtm.setRowCount(0);
        
   
          for(Country c : system.getNetworkList()){
           
            for(State s: c.getStateList()){
                for(City city: s.getCityList()){
                    
                    for(Enterprise e: city.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().getValue().equals("Trust")){
                        Object row[] = new Object[4];
                        row[0] = c;
                        row[1] = s;
                        row[2] = city;
                        row[3] = e;
                        dtm.addRow(row);
                    }
                    }
                    
                }
              
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

        btnAddNGO = new javax.swing.JButton();
        btnDeleteNGO = new javax.swing.JButton();
        lblCountry = new javax.swing.JLabel();
        cbCountry = new javax.swing.JComboBox();
        cbEnterpriseType = new javax.swing.JComboBox();
        lblEnterpriseType = new javax.swing.JLabel();
        lblState1 = new javax.swing.JLabel();
        cbState = new javax.swing.JComboBox();
        lblName = new javax.swing.JLabel();
        txtFldName = new javax.swing.JTextField();
        tblScrollPane = new javax.swing.JScrollPane();
        tblTRUST = new javax.swing.JTable();
        lblCity1 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setDoubleBuffered(false);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddNGO.setText("Add Trust");
        btnAddNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNGOActionPerformed(evt);
            }
        });
        add(btnAddNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 90, 30));

        btnDeleteNGO.setText("Delete TRUST");
        btnDeleteNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNGOActionPerformed(evt);
            }
        });
        add(btnDeleteNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        lblCountry.setText("Select Country:");
        add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 20));

        cbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountryActionPerformed(evt);
            }
        });
        add(cbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 150, 30));

        cbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseTypeActionPerformed(evt);
            }
        });
        add(cbEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 150, 30));

        lblEnterpriseType.setText("Enterprise Type:");
        add(lblEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 20));

        lblState1.setText("Select State:");
        add(lblState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 20));

        cbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStateActionPerformed(evt);
            }
        });
        add(cbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 150, 30));

        lblName.setText("Name of the TRUST:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, 20));
        add(txtFldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 150, 30));

        tblTRUST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City", "TRUST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTRUST.setMinimumSize(new java.awt.Dimension(375, 0));
        tblScrollPane.setViewportView(tblTRUST);
        if (tblTRUST.getColumnModel().getColumnCount() > 0) {
            tblTRUST.getColumnModel().getColumn(0).setResizable(false);
            tblTRUST.getColumnModel().getColumn(1).setResizable(false);
            tblTRUST.getColumnModel().getColumn(3).setResizable(false);
        }

        add(tblScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 170));

        lblCity1.setText("Select City:");
        add(lblCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, 20));

        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });
        add(cbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 150, 30));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage TRUST");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 450, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNGOActionPerformed
        // TODO add your handling code here:     
          String name = txtFldName.getText();
          Country country = (Country) cbCountry.getSelectedItem();
          State state = (State) cbState.getSelectedItem();
          City city = (City) cbCity.getSelectedItem();
        if(!name.equals("")){
                   // validate name
            String regex = "^[a-z A-Z]+$";
            Pattern namePattern = Pattern.compile(regex);
            Matcher nameMatcher = namePattern.matcher(name);

            if(!nameMatcher.matches()){
                 JOptionPane.showMessageDialog(null, "Invalid characters in ngo name", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }
            for(Country c: system.getNetworkList()){
               if(c.equals(country)){
                   for(State s: c.getStateList()){
                       if(s.equals(state)){
                          for(City cy: s.getCityList()){
                              if(cy.equals(city)){
                                cy.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Trust);
                              }
                          }
                       }
                   }   
               }     
            }
            populateTable();
            txtFldName.setText("");
            JOptionPane.showMessageDialog(null, "TRUST added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Please enter text", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddNGOActionPerformed

    private void cbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStateActionPerformed
        // TODO add your handling code here:
        populateCity();
    }//GEN-LAST:event_cbStateActionPerformed

    private void btnDeleteNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNGOActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblTRUST.getSelectedRow();
        if(selectedRow >= 0){
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the TRUST?","Warning", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                Enterprise e = (Enterprise) tblTRUST.getValueAt(selectedRow, 3);
//                Country c = (Country) tblNGO.getValueAt(selectedRow, 0);
//                State s = (State) tblNGO.getValueAt(selectedRow, 1);
                City city = (City) tblTRUST.getValueAt(selectedRow, 2);
                 
                city.getEnterpriseDirectory().deleteTrustEnterprise((TrustEnterprise)e);
                
                try{
                String[] arrOfStr = e.getName().split(" ", 2); 
                String ent = arrOfStr[0] + " OldAge";
                for (Country c : system.getNetworkList()) {
                for (State s : c.getStateList()) {
                    for (City ci : s.getCityList()) {
                        for (Enterprise en : ci.getEnterpriseDirectory().getEnterpriseList()) {
                            if(en.getName().equalsIgnoreCase(ent)){
                                ci.getEnterpriseDirectory().deleteOldAgeHomeEnterprise((OldAgeHomeEnterprise)en);
                            }
                        }
                    }
                }
                }
                }catch(ConcurrentModificationException exep){
                    
                }
                populateTable();
                JOptionPane.showMessageDialog(null, "TRUST deleted successfully","Warning", JOptionPane.WARNING_MESSAGE);
                     
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteNGOActionPerformed

    private void cbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountryActionPerformed
        // TODO add your handling code here:
        populateState();
    }//GEN-LAST:event_cbCountryActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityActionPerformed

    private void cbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnterpriseTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sawajp = (SystemAdminWorkAreaJPanel) component;
        sawajp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNGO;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteNGO;
    private javax.swing.JComboBox cbCity;
    private javax.swing.JComboBox cbCountry;
    private javax.swing.JComboBox cbEnterpriseType;
    private javax.swing.JComboBox cbState;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblState1;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTable tblTRUST;
    private javax.swing.JTextField txtFldName;
    // End of variables declaration//GEN-END:variables
}
