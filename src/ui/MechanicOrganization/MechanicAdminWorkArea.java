/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.MechanicOrganization;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author shaur
 */
public class MechanicAdminWorkArea extends javax.swing.JPanel {
	private Enterprise enterprise;
	private JPanel userProcessContainer;
	Network network;
	Organization organization;
	EcoSystem system;
	UserAccount account;

	/**
	 * Creates new form MaintanenceAdminWorkArea
	 */
	public MechanicAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
			Enterprise enterprise, Network network, EcoSystem business) {

		initComponents();
		this.userProcessContainer = userProcessContainer;
		this.enterprise = enterprise;
		this.network = network;
		this.organization = organization;
		this.system = business;
		this.account = account;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaintanenceAdminWorkArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ManageRequestPanel = new javax.swing.JPanel();
        ManageRequestLabel = new javax.swing.JLabel();
        MaintanenceRightPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        MaintanenceAdminWorkArea.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(191, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageRequestPanel.setBackground(new java.awt.Color(191, 0, 0));
        ManageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageRequestPanelMousePressed(evt);
            }
        });

        ManageRequestLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ManageRequestLabel.setForeground(new java.awt.Color(0, 51, 153));
        ManageRequestLabel.setText("Manage Requests");
        ManageRequestLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageRequestLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageRequestPanelLayout = new javax.swing.GroupLayout(ManageRequestPanel);
        ManageRequestPanel.setLayout(ManageRequestPanelLayout);
        ManageRequestPanelLayout.setHorizontalGroup(
            ManageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRequestPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ManageRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageRequestPanelLayout.setVerticalGroup(
            ManageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRequestPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ManageRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(ManageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 50));

        MaintanenceRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        MaintanenceRightPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout MaintanenceAdminWorkAreaLayout = new javax.swing.GroupLayout(MaintanenceAdminWorkArea);
        MaintanenceAdminWorkArea.setLayout(MaintanenceAdminWorkAreaLayout);
        MaintanenceAdminWorkAreaLayout.setHorizontalGroup(
            MaintanenceAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaintanenceAdminWorkAreaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1060, Short.MAX_VALUE))
            .addGroup(MaintanenceAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaintanenceAdminWorkAreaLayout.createSequentialGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
                    .addComponent(MaintanenceRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        MaintanenceAdminWorkAreaLayout.setVerticalGroup(
            MaintanenceAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(MaintanenceAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MaintanenceRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(MaintanenceAdminWorkArea, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

	private void ManageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ManageRequestPanelMousePressed
		// TODO add your handling code here:
		manageRequest();
	}// GEN-LAST:event_ManageRequestPanelMousePressed

	private void ManageRequestLabelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ManageRequestLabelMousePressed
		// TODO add your handling code here:
		manageRequest();
	}// GEN-LAST:event_ManageRequestLabelMousePressed

	public void manageRequest() {
		ManageRequestPanel.setBackground(new Color(236, 113, 107));
		// ManageEmployeePanel.setBackground(new Color(215,81,81));

		ManageOrgRequest ManageRequestPanel = new ManageOrgRequest(MaintanenceRightPanel, enterprise, system,
				organization);
		MaintanenceRightPanel.add("MangeRequest", ManageRequestPanel);
		CardLayout layout = (CardLayout) MaintanenceRightPanel.getLayout();
		layout.next(MaintanenceRightPanel);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MaintanenceAdminWorkArea;
    private javax.swing.JPanel MaintanenceRightPanel;
    private javax.swing.JLabel ManageRequestLabel;
    private javax.swing.JPanel ManageRequestPanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
