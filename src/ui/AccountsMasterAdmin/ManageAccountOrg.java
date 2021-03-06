/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AccountsMasterAdmin;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.Enterprise.Enterprise;
import Business.Organization.Billing;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Utils.HeaderColors;

/**
 *
 * @author shaur
 */
public class ManageAccountOrg extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrg
     */
    public ManageAccountOrg(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.enterprise = enterprise;
        TableManageAccountsOrg.getTableHeader().setDefaultRenderer(new HeaderColors());
        BoxAccountsOrg();
        TableManageAccountOrg();
        ButtonAccountsAdminAddEmployee.setBackground(new Color(255,255,255));
        
    }
    
    private void BoxAccountsOrg(){
        BoxAccountsOrg.removeAllItems();
        BoxAccountsOrg.addItem(Type.Billing);
        
        
    }
    
    private void TableManageAccountOrg(){
        TableManageAccountsOrg.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) TableManageAccountsOrg.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
             if(organization instanceof Billing ){
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                
                //row[2] = org.getPosition();
                model.addRow(row);
             }
            //}
        
            
        }
        
        
        
    }
    public void resetFields() {
        TFAccountsOrgName.setText("");
        
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
        TableManageAccountsOrg = new javax.swing.JTable();
        ButtonAccountsAdminAddEmployee = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFAccountsOrgName = new javax.swing.JTextField();
        BoxAccountsOrg = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Manage Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 260, 40));

        TableManageAccountsOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Type", "Organziation Name"
            }
        ));
        jScrollPane1.setViewportView(TableManageAccountsOrg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 910, 90));

        ButtonAccountsAdminAddEmployee.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAccountsAdminAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonAccountsAdminAddEmployee.setForeground(new java.awt.Color(0, 51, 153));
        ButtonAccountsAdminAddEmployee.setText("Add Organization");
        ButtonAccountsAdminAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAccountsAdminAddEmployeeActionPerformed(evt);
            }
        });
        add(ButtonAccountsAdminAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, 20));
        add(TFAccountsOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 140, -1));

        BoxAccountsOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxAccountsOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAccountsOrgActionPerformed(evt);
            }
        });
        add(BoxAccountsOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAccountsAdminAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAccountsAdminAddEmployeeActionPerformed
        // TODO add your handling code here:
        Type type = (Type) BoxAccountsOrg.getSelectedItem();
        
        if("".equals(TFAccountsOrgName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!"); 
        }else {
            enterprise.getOrganizationDirectory().createOrganization(type, TFAccountsOrgName.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            TFAccountsOrgName.setText("");
            TableManageAccountOrg();
            resetFields();
        }
    }//GEN-LAST:event_ButtonAccountsAdminAddEmployeeActionPerformed

    private void BoxAccountsOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAccountsOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxAccountsOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> BoxAccountsOrg;
    private javax.swing.JButton ButtonAccountsAdminAddEmployee;
    private javax.swing.JTextField TFAccountsOrgName;
    private javax.swing.JTable TableManageAccountsOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
