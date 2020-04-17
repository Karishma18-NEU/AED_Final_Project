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
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karishma
 */
public class ManageOldAgeHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOldAgeHomeJPanel
     */
    private JPanel userProcessContainer;
    EcoSystem system;
    public ManageOldAgeHomeJPanel(JPanel userProcessContainer, EcoSystem system) {
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
            if(type.getValue().equals("OldAgeHome")){
                cbEnterpriseType.addItem(type);
            }
        }
    }
     
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblOldAge.getModel();
        dtm.setRowCount(0);
        
   
          for(Country c : system.getNetworkList()){
           
            for(State s: c.getStateList()){
                for(City city: s.getCityList()){
                    for(Enterprise e: city.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().getValue().equals("OldAgeHome")){
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
        tblOldAge = new javax.swing.JTable();
        lblCity1 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAddNGO.setText("Add Home");
        btnAddNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNGOActionPerformed(evt);
            }
        });

        btnDeleteNGO.setText("Delete Home");
        btnDeleteNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNGOActionPerformed(evt);
            }
        });

        lblCountry.setText("Select Country:");

        cbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountryActionPerformed(evt);
            }
        });

        cbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnterpriseTypeActionPerformed(evt);
            }
        });

        lblEnterpriseType.setText("Enterprise Type:");

        lblState1.setText("Select State:");

        cbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStateActionPerformed(evt);
            }
        });

        lblName.setText("Name of the OldAgeHome:");

        tblOldAge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City", "OldAgeHome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOldAge.setMinimumSize(new java.awt.Dimension(375, 0));
        tblScrollPane.setViewportView(tblOldAge);
        if (tblOldAge.getColumnModel().getColumnCount() > 0) {
            tblOldAge.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblOldAge.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblOldAge.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblOldAge.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        lblCity1.setText("Select City:");

        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Old Age Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteNGO)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEnterpriseType)
                                        .addComponent(lblName))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(41, 41, 41)
                                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblState1)
                                        .addComponent(lblCountry)
                                        .addComponent(lblCity1))
                                    .addGap(95, 95, 95)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnAddNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnDeleteNGO)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblState1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbState))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCity))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnAddNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
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
                                    cy.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.OldAgeHome);
                                }
                            }
                        }
                    }
                }

            }
            populateTable();
            txtFldName.setText("");
            JOptionPane.showMessageDialog(null, "OldAgeHome added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Please enter text", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddNGOActionPerformed

    private void btnDeleteNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNGOActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOldAge.getSelectedRow();
        if(selectedRow >= 0){
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the OldAgeHome ?","Warning", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                Enterprise e = (Enterprise) tblOldAge.getValueAt(selectedRow, 3);
                //                Country c = (Country) tblNGO.getValueAt(selectedRow, 0);
                //                State s = (State) tblNGO.getValueAt(selectedRow, 1);
                City city = (City) tblOldAge.getValueAt(selectedRow, 2);

                city.getEnterpriseDirectory().deleteOldAgeHomeEnterprise((OldAgeHomeEnterprise)e);
                populateTable();
                JOptionPane.showMessageDialog(null, "OldAgeHome  deleted successfully","Warning", JOptionPane.WARNING_MESSAGE);

            }

        }else{
            JOptionPane.showMessageDialog(null, "Please select a row","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteNGOActionPerformed

    private void cbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountryActionPerformed
        // TODO add your handling code here:
        populateState();
    }//GEN-LAST:event_cbCountryActionPerformed

    private void cbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEnterpriseTypeActionPerformed

    private void cbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStateActionPerformed
        // TODO add your handling code here:
        populateCity();
    }//GEN-LAST:event_cbStateActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCityActionPerformed

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
    private javax.swing.JTable tblOldAge;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTextField txtFldName;
    // End of variables declaration//GEN-END:variables
}
