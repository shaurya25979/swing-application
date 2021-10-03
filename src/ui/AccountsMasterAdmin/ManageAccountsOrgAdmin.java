/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AccountsMasterAdmin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Billing;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Cashier;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Utils.HeaderColors;

/**
 *
 * @author shaur
 */
public class ManageAccountsOrgAdmin extends javax.swing.JPanel {
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    

    /**
     * Creates new form ManageEmployee
     */
    public ManageAccountsOrgAdmin(JPanel userProcessContainer,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.container = userProcessContainer;
        this.ecosystem = system;    
        tblManageOrgAdmin.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        populateTable();
        
    }
    
                                            
    public void resetFields() {
        TFAccountsEmployeeUname.setText("");
    }
    private void populateOrganizationComboBox() {
        BoxAccountsOrg.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            BoxAccountsOrg.addItem(organization);
            }
        }
    
    
    private void populateTable(){
        tblManageOrgAdmin.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) tblManageOrgAdmin.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof Billing){
                for (Employee ua : organization.getEmployeeDirectory().getEmployeeList()) {
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = organization.getType().getValue();
                    ((DefaultTableModel) tblManageOrgAdmin.getModel()).addRow(row);
                }
            }
        }
        
        
    }
    private void populateRoleComboBox(Organization organization) {
        BoxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            BoxRole.addItem(role);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageOrgAdmin = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ButtonAddOrgAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BoxAccountsOrg = new javax.swing.JComboBox();
        BoxRole = new javax.swing.JComboBox();
        TFAccountsEmployeeUname = new javax.swing.JTextField();
        TFAccountsEmployeePass = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Manage Employee");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 230, 40));

        tblManageOrgAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Organization"
            }
        ));
        jScrollPane1.setViewportView(tblManageOrgAdmin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 410, 90));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, 20));

        ButtonAddOrgAdmin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAddOrgAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonAddOrgAdmin.setForeground(new java.awt.Color(0, 51, 153));
        ButtonAddOrgAdmin.setText("Add Employee");
        ButtonAddOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddOrgAdminActionPerformed(evt);
            }
        });
        add(ButtonAddOrgAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Username");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Role");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 20));

        BoxAccountsOrg.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        BoxAccountsOrg.setForeground(new java.awt.Color(25, 56, 82));
        BoxAccountsOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxAccountsOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAccountsOrgActionPerformed(evt);
            }
        });
        add(BoxAccountsOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 140, -1));

        BoxRole.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        BoxRole.setForeground(new java.awt.Color(25, 56, 82));
        BoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxRoleActionPerformed(evt);
            }
        });
        add(BoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 140, -1));
        add(TFAccountsEmployeeUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 140, -1));
        add(TFAccountsEmployeePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAddOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddOrgAdminActionPerformed
        // TODO add your handling code here:
        String userName = TFAccountsEmployeeUname.getText();
        String password = TFAccountsEmployeePass.getText();
        if("".equals(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        }else if(!ecosystem.checkIfUserIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter unique username");
        }else if("".equals(password)) {
            JOptionPane.showMessageDialog(null, "Please enter password");
        }else {
            Organization organization = (Organization) BoxAccountsOrg.getSelectedItem();
            //Employee employee = (Employee) employeeComboBox2.getSelectedItem();
            Role role = (Role) BoxRole.getSelectedItem();
            Employee employee = organization.getEmployeeDirectory().createEmployee(userName);
            enterprise.getUserAccountDirectory().createUserAccount(userName, password,employee, role);
            populateTable();
            JOptionPane.showMessageDialog(null, "User is created successfully");
            TFAccountsEmployeeUname.setText("");
            TFAccountsEmployeePass.setText("");
        }
    }//GEN-LAST:event_ButtonAddOrgAdminActionPerformed

    private void BoxAccountsOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAccountsOrgActionPerformed
        Organization organization = (Organization) BoxAccountsOrg.getSelectedItem();
        if (organization != null){
            //            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_BoxAccountsOrgActionPerformed

    private void BoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxRoleActionPerformed

    }//GEN-LAST:event_BoxRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BoxAccountsOrg;
    private javax.swing.JComboBox BoxRole;
    private javax.swing.JButton ButtonAddOrgAdmin;
    private javax.swing.JTextField TFAccountsEmployeePass;
    private javax.swing.JTextField TFAccountsEmployeeUname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageOrgAdmin;
    // End of variables declaration//GEN-END:variables
}
