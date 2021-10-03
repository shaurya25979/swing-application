/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Billing;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import ui.BodyShopOrganization.ManageBodyShopRequest;

/**
 *
 * @author shaur
 */
public class BillingAdminWorkArea extends javax.swing.JPanel {
        private Enterprise enterprise;
	private JPanel userProcessContainer;
	Network network;
	Organization organization;
	EcoSystem system;
	UserAccount account;
    /**
     * Creates new form BillingAdminWorkArea
     */
    public BillingAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
			Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
		this.enterprise = enterprise;
		this.network = network;
		this.organization = organization;
		this.system = business;
		this.account = account;
    }
    public void manageRequest() {
		jPanel3.setBackground(new Color(236, 113, 107));
		// ManageEmployeePanel.setBackground(new Color(215,81,81));

		BillingRequest manageReqPanel = new BillingRequest(BillingRightPanel, network, enterprise,
				account, system, organization, account.getServiceDirectory());
		BillingRightPanel.add("ManageRequest", manageReqPanel);
		CardLayout layout = (CardLayout) BillingRightPanel.getLayout();
		layout.next(BillingRightPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillingAdminWorkArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BillingRightPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        BillingAdminWorkArea.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(191, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(191, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Manage Request");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 60));

        BillingRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        BillingRightPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout BillingAdminWorkAreaLayout = new javax.swing.GroupLayout(BillingAdminWorkArea);
        BillingAdminWorkArea.setLayout(BillingAdminWorkAreaLayout);
        BillingAdminWorkAreaLayout.setHorizontalGroup(
            BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
            .addGroup(BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BillingAdminWorkAreaLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1060, Short.MAX_VALUE)))
            .addGroup(BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingAdminWorkAreaLayout.createSequentialGroup()
                    .addGap(0, 300, Short.MAX_VALUE)
                    .addComponent(BillingRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        BillingAdminWorkAreaLayout.setVerticalGroup(
            BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
            .addGroup(BillingAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BillingRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        add(BillingAdminWorkArea, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        manageRequest();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        manageRequest();
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillingAdminWorkArea;
    private javax.swing.JPanel BillingRightPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}