/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SparePartsSalesAdmin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Workqueue.ServiceRequest;
import Utils.HeaderColors;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author shaur
 */
public class ManageSparePartRequest extends javax.swing.JPanel {
	JPanel userProcessContainer;
	UserAccount account;
	Organization organization;
	Enterprise enterprise;
	Network network;
	EcoSystem business;

	/**
	 * Creates new form ManageRequest
	 */
	public ManageSparePartRequest(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business,
			Organization organization) {
		initComponents();
		this.userProcessContainer = userProcessContainer;
		this.enterprise = enterprise;
		this.business = business;
		this.organization = organization;
		tblSparePartsSales.getTableHeader().setDefaultRenderer(new HeaderColors());
		populateTable();
	}

	private void populateTable() {
		tblSparePartsSales.getTableHeader().setDefaultRenderer(new HeaderColors());
		DefaultTableModel model = (DefaultTableModel) tblSparePartsSales.getModel();
		model.setRowCount(0);
		ArrayList<UserAccount> userAccountList = business.getUserAccountDirectory().getUserAccountList();
		for (UserAccount account : userAccountList) {
			for (ServiceRequest wr : account.getServiceDirectory().getServiceRequestList()) {
				if (wr.getStatus().equalsIgnoreCase("New") || wr.getStatus().equalsIgnoreCase("Processed by Exterior Cleaner")
                                        || wr.getStatus().equalsIgnoreCase("Assigned to me"))
					if(wr.getEnterprisetype().getValue().equalsIgnoreCase("Spare Parts")
                                                || wr.getEnterprisetype().getValue().equalsIgnoreCase("All")) {
					Object[] row = new Object[model.getColumnCount()];
					row[0] = ((ServiceRequest) wr);
					row[1] = ((ServiceRequest) wr).getName();
					row[2] = ((ServiceRequest) wr).getModel();
					row[3] = ((ServiceRequest) wr).getMake();
					row[4] = ((ServiceRequest) wr).getModelyear();
					row[5] = ((ServiceRequest) wr).getRegno();
					row[6] = ((ServiceRequest) wr).getEnterprisetype().getValue();
                                        row[7] = ((ServiceRequest) wr).getStatus();
					row[8] = ((ServiceRequest) wr).getSender();

					model.addRow(row);
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
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSparePartsSales = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        BoxAssignSparePartsEmployee = new javax.swing.JComboBox<>();
        ButtonSparePartsCompleteRequest = new javax.swing.JButton();
        ButtonSparePartsAssignEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Manage Service Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 300, 40));

        tblSparePartsSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Name", "Model", "Make", "Model Year", "Registration number", "Service Requested", "Status", "Sender"
            }
        ));
        jScrollPane1.setViewportView(tblSparePartsSales);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 740, 90));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, 20));

        BoxAssignSparePartsEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(BoxAssignSparePartsEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 110, -1));

        ButtonSparePartsCompleteRequest.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSparePartsCompleteRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonSparePartsCompleteRequest.setForeground(new java.awt.Color(0, 51, 153));
        ButtonSparePartsCompleteRequest.setText("Complete");
        ButtonSparePartsCompleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSparePartsCompleteRequestActionPerformed(evt);
            }
        });
        add(ButtonSparePartsCompleteRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 160, 20));

        ButtonSparePartsAssignEmployee.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSparePartsAssignEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonSparePartsAssignEmployee.setForeground(new java.awt.Color(0, 51, 153));
        ButtonSparePartsAssignEmployee.setText("Assign");
        ButtonSparePartsAssignEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSparePartsAssignEmployeeActionPerformed(evt);
            }
        });
        add(ButtonSparePartsAssignEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 160, 20));
    }// </editor-fold>//GEN-END:initComponents

	private void ButtonSparePartsAssignEmployeeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonSparePartsAssignEmployeeActionPerformed
		// TODO add your handling code here:
		int count = tblSparePartsSales.getSelectedRowCount();
		if (count != 1) {
			JOptionPane.showMessageDialog(null, "Select one row", "Warning", JOptionPane.WARNING_MESSAGE);
		} else {
			int selectedRow = tblSparePartsSales.getSelectedRow();
			ServiceRequest sr = (ServiceRequest) tblSparePartsSales.getValueAt(selectedRow, 0);
			if (sr.getStatus().equals("New") || sr.getStatus().equalsIgnoreCase("Processed by Exterior Cleaner")) {

				String msg = JOptionPane.showInputDialog("Additional Message");
				sr.setStatus("Assigned to me");
			}
                        populateTable();
		}

	}// GEN-LAST:event_ButtonSparePartsAssignEmployeeActionPerformed

	private void ButtonSparePartsCompleteRequestActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonSparePartsCompleteRequestActionPerformed
		// TODO add your handling code here:
		int count = tblSparePartsSales.getSelectedRowCount();
		if (count != 1) {
			JOptionPane.showMessageDialog(null, "Select one row", "Warning", JOptionPane.WARNING_MESSAGE);
		} else {
			int selectedRow = tblSparePartsSales.getSelectedRow();
			ServiceRequest sr = (ServiceRequest) tblSparePartsSales.getValueAt(selectedRow, 0);
			if (sr.getStatus().equalsIgnoreCase("New")
					|| sr.getStatus().equalsIgnoreCase("Processed by Exterior Cleaner")) {
				JOptionPane.showMessageDialog(null, "First assign process");
			} else if (sr.getStatus().equals("Assigned to me")) {
				sr.setStatus("Processed by Spare Parts Sales");
			}
                        populateTable();
		}
	}// GEN-LAST:event_ButtonSparePartsCompleteRequestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxAssignSparePartsEmployee;
    private javax.swing.JButton ButtonSparePartsAssignEmployee;
    private javax.swing.JButton ButtonSparePartsCompleteRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSparePartsSales;
    // End of variables declaration//GEN-END:variables
}