/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CleaningEnterpriseAdmin;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.Enterprise.Enterprise;
import Business.Organization.CleaningExterior;
import Business.Organization.CleaningInterior;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Utils.HeaderColors;

/**
 *
 * @author shaur
 */
public class ManageClearningOrg extends javax.swing.JPanel {
    JPanel userProcessContainer;
//    OrganizationDirectory directory;
//    UserAccount account;
//    Organization organization;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrg
     */
    public ManageClearningOrg(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.directory = directory;
//        this.account = account;
//        this.organization = organization;
        this.enterprise = enterprise;
        TableManageCleaningOrg.getTableHeader().setDefaultRenderer(new HeaderColors());
        BoxMaintanenceOrg();
        TableManageMaintanenceOrg();
        ButtonCleaningAdminAddEmployee.setBackground(new Color(255,255,255));
        
    }
    
    private void BoxMaintanenceOrg(){
        BoxCleaningOrg.removeAllItems();
        BoxCleaningOrg.addItem(Type.CleaningInterior);
        BoxCleaningOrg.addItem(Type.CleaningExterior);
        
    }
    
    private void TableManageMaintanenceOrg(){
        TableManageCleaningOrg.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) TableManageCleaningOrg.getModel();
        
        model.setRowCount(0);
        
       for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
			if (organization instanceof CleaningInterior) {
				CleaningInterior cleaninginterior = (CleaningInterior) organization;

				Object[] row = new Object[2];
				row[0] = organization.getType().getValue();
				row[1] = organization.getName();

				// row[2] = org.getPosition();
				model.addRow(row);
			} else if (organization instanceof CleaningExterior) {
				CleaningExterior cleaningexterior = (CleaningExterior) organization;

				Object[] row = new Object[2];
				row[0] = organization.getType().getValue();
				row[1] = organization.getName();

				// row[2] = org.getPosition();
				model.addRow(row);
			}
		}
        
        
        
    }
    public void resetFields() {
        TFCleaningOrgName.setText("");
        
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
        TableManageCleaningOrg = new javax.swing.JTable();
        BoxCleaningOrg = new javax.swing.JComboBox<>();
        ButtonCleaningAdminAddEmployee = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFCleaningOrgName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Manage Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 260, 40));

        TableManageCleaningOrg.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableManageCleaningOrg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 910, 90));

        BoxCleaningOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(BoxCleaningOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, -1));

        ButtonCleaningAdminAddEmployee.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCleaningAdminAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonCleaningAdminAddEmployee.setForeground(new java.awt.Color(0, 51, 153));
        ButtonCleaningAdminAddEmployee.setText("Add Organization");
        ButtonCleaningAdminAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCleaningAdminAddEmployeeActionPerformed(evt);
            }
        });
        add(ButtonCleaningAdminAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, 30));

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
        add(TFCleaningOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCleaningAdminAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCleaningAdminAddEmployeeActionPerformed
        // TODO add your handling code here:
        Type type = (Type) BoxCleaningOrg.getSelectedItem();
        
        if("".equals(TFCleaningOrgName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!"); 
        }else {
            enterprise.getOrganizationDirectory().createOrganization(type,TFCleaningOrgName.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            TFCleaningOrgName.setText("");
            TableManageMaintanenceOrg();
            resetFields();
        }
    }//GEN-LAST:event_ButtonCleaningAdminAddEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> BoxCleaningOrg;
    private javax.swing.JButton ButtonCleaningAdminAddEmployee;
    private javax.swing.JTextField TFCleaningOrgName;
    private javax.swing.JTable TableManageCleaningOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}