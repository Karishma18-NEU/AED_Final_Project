/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CoordinatorWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OldAgeHomeEnterprise;
import Business.SeniorCare.SeniorCare;
import Business.Network.City;
import Business.Network.Country;
import Business.Network.State;
import Business.Organization.SeniorCareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SeniorCareWorkRequest;
import Business.WorkQueue.PostTaskWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vardhana Bhatt
 */
public class ProcessTreatmentWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessTreatmentWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private PostTaskWorkRequest request;
   
    public ProcessTreatmentWorkRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, Organization organization, PostTaskWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.request = request;
        populateCountry();
        populateState();
        populateCity();
        populateEnterpriseType();
    }
    
    private void populateCountry() {
        cbCountry.removeAllItems();
        for (Country c : system.getNetworkList()) {
            cbCountry.addItem(c);
        }
    }

    private void populateState() {
        cbState.removeAllItems();
        if (cbCountry.getSelectedItem() != null) {
            for (Country c : system.getNetworkList()) {
                if (c.equals(cbCountry.getSelectedItem())) {
                    for (State s : c.getStateList()) {
                        cbState.addItem(s);
                    }
                }
            }
        }
    }

    private void populateCity() {
        cbCity.removeAllItems();
        if (cbState.getSelectedItem() != null) {
            for (Country c : system.getNetworkList()) {
                for (State s : c.getStateList()) {
                    if (s.equals(cbState.getSelectedItem())) {
                        for (City city : s.getCityList()) {
                            cbCity.addItem(city);
                        }
                    }
                }
            }
        }
    }

    public void populateEnterpriseType() {
        cbTrustName.removeAllItems();
        if (cbCity.getSelectedItem() != null) {
            for (Country c : system.getNetworkList()) {
                for (State s : c.getStateList()) {
                    for (City city : s.getCityList()) {
                        if (city.equals(cbCity.getSelectedItem())) {
                            for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                                if(e.getEnterpriseType().getValue().equals("OldAgeHome")){
                                    cbTrustName.addItem(e);
                                }
                            }
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

        backJButton = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        cbCountry = new javax.swing.JComboBox<>();
        lblState = new javax.swing.JLabel();
        cbState = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox<>();
        lblEnterpriseType = new javax.swing.JLabel();
        cbTrustName = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Process Treatment Work Request");

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCountry.setText("Country:");

        cbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountryActionPerformed(evt);
            }
        });

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblState.setText("State:");

        cbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStateActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");

        cbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCityActionPerformed(evt);
            }
        });

        lblEnterpriseType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterpriseType.setText("Trust Name:");

        jLabel1.setText("Name of the child:");

        jLabel2.setText("Age of the child:");

        submitJButton.setText("Send to Senior Care");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton)
                            .addGap(130, 130, 130)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(submitJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbTrustName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTrustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitJButton)
                .addContainerGap(435, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OngoingProjectsJPanel opjp = (OngoingProjectsJPanel) component;
        opjp.populateOngoingProjectsTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void cbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountryActionPerformed
        // TODO add your handling code here:
        populateState();
    }//GEN-LAST:event_cbCountryActionPerformed

    private void cbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStateActionPerformed
        // TODO add your handling code here:
        populateCity();
    }//GEN-LAST:event_cbStateActionPerformed

    private void cbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCityActionPerformed
        // TODO add your handling code here:
        populateEnterpriseType();
    }//GEN-LAST:event_cbCityActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        enterprise = (Enterprise) cbTrustName.getSelectedItem();
        String name = txtName.getText();
        String age = txtAge.getText();

        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter value name of the senior", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

        if(age.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter age of the senior", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

        // validate text
        String regex = "^[a-z A-Z 0-9 .]+$";
        Pattern namePattern = Pattern.compile(regex);
        Matcher nameMatcher = namePattern.matcher(name);

        String re = "^[0-9]+$";
        Pattern agePattern = Pattern.compile(re);
        Matcher ageMatcher = agePattern.matcher(age);

        if(!nameMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Invalid characters in name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(!ageMatcher.matches()){
            JOptionPane.showMessageDialog(null, "Invalid number in age", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int ag = Integer.parseInt(age);

        request.setWorkDone("Sent to Care");
        request.setStatus("Completed");

        SeniorCareWorkRequest req = new SeniorCareWorkRequest();
        SeniorCare senior = new SeniorCare();
        senior.setName(name);
        senior.setAge(ag);
        senior.setCountry(cbCountry.getSelectedItem().toString());
        senior.setState(cbState.getSelectedItem().toString());
        senior.setCity(cbCity.getSelectedItem().toString());
        senior.setStatus(true);
        req.setSenior(senior);

        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof SeniorCareOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(req);
            }
        }

        JOptionPane.showMessageDialog(null, "Request successfully sent to SeniorCare", "Information", JOptionPane.INFORMATION_MESSAGE);
        txtName.setText("");
        txtAge.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<Object> cbCity;
    private javax.swing.JComboBox<Object> cbCountry;
    private javax.swing.JComboBox<Object> cbState;
    private javax.swing.JComboBox cbTrustName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblState;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
