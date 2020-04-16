/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmployeeViewArea;

import java.awt.CardLayout;
import java.io.File;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class EmailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmailJPanel
     */
    private JPanel userProcessContainer;
    private File file;
    public EmailJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack2 = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        txtFldTo = new javax.swing.JTextField();
        lblSubject1 = new javax.swing.JLabel();
        txtFldSubject = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessage = new javax.swing.JTextArea();
        btnSendEmail = new javax.swing.JButton();

        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Send an Email");

        lblTo.setText("To:");

        lblSubject1.setText("Subject:");

        txtFldSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSubjectActionPerformed(evt);
            }
        });

        lblMessage.setText("Message:");

        txtAreaMessage.setColumns(20);
        txtAreaMessage.setLineWrap(true);
        txtAreaMessage.setRows(5);
        txtAreaMessage.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaMessage);

        btnSendEmail.setText("Send");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack2)
                            .addGap(115, 115, 115)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblTo)
                            .addGap(85, 85, 85)
                            .addComponent(txtFldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblSubject1)
                            .addGap(52, 52, 52)
                            .addComponent(txtFldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblMessage))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(btnSendEmail)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBack2)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTo)
                        .addComponent(txtFldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSubject1)
                        .addComponent(txtFldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addComponent(lblMessage)
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(btnSendEmail)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void txtFldSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSubjectActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        try {
            // TODO add your handling code here:

            sendEmail();
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong. "
                + "\n Email could not be sent. "
                + "\n Please check your credentials and mail settings ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSendEmailActionPerformed
public void sendEmail() throws MessagingException {

        String to = txtFldTo.getText();
        String from = "trustseniorcaresystem@gmail.com";
        //char[] passwordCharArray = passFld.getPassword();
        String password = "seniorcaresystem";//String.valueOf(passwordCharArray);
        String message = txtAreaMessage.getText();
        String subject = txtFldSubject.getText();

        //String selectedFile = txtFldFileChooser.getText();
        //String fileName = selectedFile;
        //fileName = fileName.substring(fileName.lastIndexOf('\\') + 1);

        if (to.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter value in to field", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (from.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter value in from field", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter value in password field", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // validate email
        String regex = "(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$)";
        Pattern emailPattern = Pattern.compile(regex);
        Matcher toMatcher = emailPattern.matcher(to);
        Matcher fromMatcher = emailPattern.matcher(from);

        if (!toMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "Invalid email address in to field", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!fromMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "Invalid email address in from field", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Properties mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        // System.out.println("Mail Server Properties have been setup successfully..");

        MimeMessage generateMailMessage;

        // Step2
        // System.out.println("\n\n 2nd ===> get Mail Session..");
        Session getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        //generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("singhekta1291@gmail.com"));
        generateMailMessage.setSubject(subject);
        BodyPart messageBodyPart = new MimeBodyPart();
        String emailBody = message + "\n\n Regards, \n Trust Senior Care System";
        //generateMailMessage.setText(emailBody);
        messageBodyPart.setText(emailBody);
        
            
            
             // Create a multipar message
         Multipart multipart = new MimeMultipart();
         multipart.addBodyPart(messageBodyPart);

         

         generateMailMessage.setContent(multipart);
         
        System.out.println("Mail Session has been created successfully..");

        // Step3
        // System.out.println("\n\n 3rd ===> Get Session and Send mail");
        Transport transport = getMailSession.getTransport("smtp");

        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        transport.connect("smtp.gmail.com", from, password);
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
        JOptionPane.showMessageDialog(null, "Email sent successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        txtFldTo.setText("");
        txtFldSubject.setText("");
        //txtFldFileChooser.setText("");
        txtAreaMessage.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSubject1;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTextArea txtAreaMessage;
    private javax.swing.JTextField txtFldSubject;
    private javax.swing.JTextField txtFldTo;
    // End of variables declaration//GEN-END:variables
}
