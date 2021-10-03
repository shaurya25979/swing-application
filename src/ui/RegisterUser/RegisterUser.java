/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RegisterUser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Utils.Validation;


/**
 *
 * @author shaur
 */
public class RegisterUser extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private Validation validation;
    private ActionListener eventListener;
    private boolean emailValid;
    private boolean contactValid;
    private boolean userUnique;
    private Employee employee;
    private Customer customer;
    /**
     * Creates new form RegisterUser
     */
    public RegisterUser(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
//        this.organization = org;
//        this.customer = customer;
        
        this.validation = new Validation();
        usernameExistsMessage.setVisible(false);
        emailValidateMessage.setVisible(false);
        emailSuccessLabel.setVisible(false);
        userNameSuccessLabel.setVisible(false);
        
    }
    
    public static void sendEmailMessage(String emailId) {
// Recipient's email ID needs to be mentioned.
        String to = emailId;
        String from = "donotreplyers@gmail.com";
        String pass = "";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

// Set Subject: header field
            message.setSubject("Customer Registration");
            message.setText("Thank you for registering with us. Your account is activated");
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendTextMessage(String contact) {
        // Recipient's email ID needs to be mentioned.
        String to = contact;
        System.out.println(contact);
        String from = "donotreplyers@gmail.com";
        String pass = "";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";
        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        // properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        // Setup mail server
        // properties.setProperty("mail.smtp.host", host);
        //  properties.put("mail.smtp.starttls.enable", "true");
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        //       final PasswordAuthentication auth = new PasswordAuthentication(from, pass);
//Session session = Session.getDefaultInstance(properties, new Authenticator() {
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() { return auth; }
//});
//Session session = Session.getInstance(properties);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Customer Registration");
            message.setText("Thank you for registering with us. Your account is activated");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public Boolean contactValidity(String custContact) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(custContact);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFLicenseNew = new javax.swing.JTextField();
        TFPhNoNew = new javax.swing.JTextField();
        TFEmailNew = new javax.swing.JTextField();
        TFNameNew = new javax.swing.JTextField();
        TFCityNew = new javax.swing.JTextField();
        TFStateNew = new javax.swing.JTextField();
        TFVehicleNew = new javax.swing.JTextField();
        TFPassNew = new javax.swing.JTextField();
        TFUsernameNew = new javax.swing.JTextField();
        BtnRegister = new javax.swing.JButton();
        BtnUploadLicense = new javax.swing.JButton();
        userNameSuccessLabel = new javax.swing.JLabel();
        usernameExistsMessage = new javax.swing.JLabel();
        emailValidateMessage = new javax.swing.JLabel();
        emailSuccessLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Welcome for a seemless experience!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 440, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("State");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Email ID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Phone Number");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("License Number");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Vehicle Registration Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("City");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        TFLicenseNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFLicenseNewKeyTyped(evt);
            }
        });
        add(TFLicenseNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 160, -1));

        TFPhNoNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFPhNoNewKeyTyped(evt);
            }
        });
        add(TFPhNoNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 160, -1));

        TFEmailNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEmailNewActionPerformed(evt);
            }
        });
        TFEmailNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFEmailNewKeyTyped(evt);
            }
        });
        add(TFEmailNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 160, -1));

        TFNameNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNameNewKeyTyped(evt);
            }
        });
        add(TFNameNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, -1));

        TFCityNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCityNewKeyTyped(evt);
            }
        });
        add(TFCityNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 160, -1));

        TFStateNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFStateNewKeyTyped(evt);
            }
        });
        add(TFStateNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 160, -1));

        TFVehicleNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFVehicleNewKeyTyped(evt);
            }
        });
        add(TFVehicleNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 160, -1));

        TFPassNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFPassNewKeyTyped(evt);
            }
        });
        add(TFPassNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 160, -1));

        TFUsernameNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFUsernameNewKeyTyped(evt);
            }
        });
        add(TFUsernameNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 160, -1));

        BtnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRegister.setForeground(new java.awt.Color(0, 51, 153));
        BtnRegister.setText("Register");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });
        add(BtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 130, -1));

        BtnUploadLicense.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnUploadLicense.setForeground(new java.awt.Color(0, 51, 153));
        BtnUploadLicense.setText("Upload Photo");
        add(BtnUploadLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 130, -1));

        userNameSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick1.4.gif"))); // NOI18N
        add(userNameSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 143, -1, 30));

        usernameExistsMessage.setForeground(new java.awt.Color(255, 0, 0));
        usernameExistsMessage.setText("Username already exists");
        add(usernameExistsMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        emailValidateMessage.setForeground(new java.awt.Color(255, 0, 0));
        emailValidateMessage.setText("Email format incorrect");
        add(emailValidateMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

        emailSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick1.4.gif"))); // NOI18N
        add(emailSuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        // TODO add your handling code here:
        if (TFNameNew.getText().isEmpty()) {
            TFNameNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFNameNew.setForeground(Color.red);

        }
        if (TFUsernameNew.getText().isEmpty()) {
            TFUsernameNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFUsernameNew.setForeground(Color.red);

        }
        if (TFPassNew.getText().isEmpty()) {
            TFPassNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFPassNew.setForeground(Color.red);

        }
        if (TFEmailNew.getText().isEmpty()) {
            TFEmailNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFEmailNew.setForeground(Color.red);

        }
        if (TFPhNoNew.getText().isEmpty()) {
            TFPhNoNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFPhNoNew.setForeground(Color.red);

        }
        
        if (TFLicenseNew.getText().isEmpty()) {
            TFLicenseNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFLicenseNew.setForeground(Color.red);

        }
        if (TFVehicleNew.getText().isEmpty()) {
            TFVehicleNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFVehicleNew.setForeground(Color.red);

        }
        if (TFCityNew.getText().isEmpty()) {
            TFCityNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFCityNew.setForeground(Color.red);

        }
        if (TFStateNew.getText().isEmpty()) {
            TFStateNew.setBorder(BorderFactory.createLineBorder(Color.RED));
            TFStateNew.setForeground(Color.red);

        }
        
        if (TFUsernameNew.getText().isEmpty()
                || TFPassNew.getText().isEmpty()
                || TFEmailNew.getText().isEmpty()
                || TFCityNew.getText().isEmpty()
                
                || TFPhNoNew.getText().isEmpty()
                || TFStateNew.getText().isEmpty()
                ||TFNameNew.getText().isEmpty()
                ||TFLicenseNew.getText().isEmpty()
                ||TFVehicleNew.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } else if(!contactValidity(TFPhNoNew.getText())){
            JOptionPane.showMessageDialog(null, "Phone format incorrect");
        } 
        else if (emailValid && userUnique) {
            
            Customer customer = new Customer(TFNameNew.getText());
            
//            UserAccountDirectory ud = new UserAccountDirectory();
            system.getUserAccountDirectory().createUserAccount(TFUsernameNew.getText(), TFPassNew.getText(),employee, new Business.Role.Customer());
            system.getCustomerDirectory().createCustomer(TFUsernameNew.getText());
//            organization.getUserAccountDirectory().createUserAccount(TFUsernameNew.getText(), TFPassNew.getText(),employee, new Business.Role.Customer());
//            Customer cust = new Customer(TFNameNew.getText());
            customer.setName(TFNameNew.getText());
            customer.setUserName(TFUsernameNew.getText());
            customer.setPassword(TFPassNew.getText());
            customer.setPhoneNum(TFPhNoNew.getText());
            customer.setEmail(TFEmailNew.getText());
            customer.setLicenseNo(TFLicenseNew.getText());
            customer.setRegNo(TFVehicleNew.getText());
            customer.setState(TFStateNew.getText());
            customer.setCity(TFCityNew.getText());
            //UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
            

            
            
//            sendEmailMessage(TFEmailNew.getText());
//            sendTextMessage(TFPhNoNew.getText());
            /*for (Network network1 : system.getNetworkList()) {
                for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.VoluntaryOperatingUnit) {
                        if (enterprise.getWorkQueue() == null) {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                    }
                }
            }*/
            JOptionPane.showMessageDialog(null, "You have been registered succesfully!");
            TFNameNew.setText("");
            TFUsernameNew.setText("");
            TFEmailNew.setText("");
            TFPhNoNew.setText("");
            TFCityNew.setText("");
            TFStateNew.setText("");
            TFLicenseNew.setText("");
            TFVehicleNew.setText("");
            TFPassNew.setText("");
        } else if (!emailValid || !contactValid || !userUnique) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void TFEmailNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEmailNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEmailNewActionPerformed

    private void TFNameNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNameNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNameNewKeyTyped

    private void TFUsernameNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFUsernameNewKeyTyped
        // TODO add your handling code here:
        if (!system.checkIfUserIsUnique(TFUsernameNew.getText())) {
            usernameExistsMessage.setVisible(true);
            userNameSuccessLabel.setVisible(false);
            userUnique = false;
        } else {
            TFUsernameNew.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            TFUsernameNew.setForeground(Color.BLACK);
            usernameExistsMessage.setVisible(false);
            userNameSuccessLabel.setVisible(true);
            userUnique = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    userNameSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_TFUsernameNewKeyTyped

    private void TFPassNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPassNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPassNewKeyTyped

    private void TFEmailNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFEmailNewKeyTyped
        // TODO add your handling code here:
        if (!validation.emailValidator(TFEmailNew.getText())) {
            emailValidateMessage.setVisible(true);
            emailValid = false;
        } else {
            TFEmailNew.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            TFEmailNew.setForeground(Color.BLACK);
            emailValidateMessage.setVisible(false);
            emailSuccessLabel.setVisible(true);
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    emailSuccessLabel.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_TFEmailNewKeyTyped

    private void TFPhNoNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPhNoNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPhNoNewKeyTyped

    private void TFLicenseNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFLicenseNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLicenseNewKeyTyped

    private void TFVehicleNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFVehicleNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVehicleNewKeyTyped

    private void TFCityNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCityNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCityNewKeyTyped

    private void TFStateNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFStateNewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TFStateNewKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegister;
    private javax.swing.JButton BtnUploadLicense;
    private javax.swing.JTextField TFCityNew;
    private javax.swing.JTextField TFEmailNew;
    private javax.swing.JTextField TFLicenseNew;
    private javax.swing.JTextField TFNameNew;
    private javax.swing.JTextField TFPassNew;
    private javax.swing.JTextField TFPhNoNew;
    private javax.swing.JTextField TFStateNew;
    private javax.swing.JTextField TFUsernameNew;
    private javax.swing.JTextField TFVehicleNew;
    private javax.swing.JLabel emailSuccessLabel;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel userNameSuccessLabel;
    private javax.swing.JLabel usernameExistsMessage;
    // End of variables declaration//GEN-END:variables
}
