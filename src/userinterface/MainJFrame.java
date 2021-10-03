/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AccountsAdmin;
import Business.Role.BodyShopHead;
import Business.Role.CleanerInteriorHead;
import Business.Role.CleaningAdmin;
import Business.Role.Customer;
import Business.Role.MaintenanceAdmin;
import Business.Role.MechanicHead;
import Business.Role.SparePartsAdmin;
import Business.Role.SparePartsInstallerHead;
import Business.Role.SparePartsSalesHead;
import Business.UserAccount.UserAccount;
import ui.RegisterUser.RegisterUser;

/**
 *
 * @author shaur
 */
public class MainJFrame extends javax.swing.JFrame {
	private EcoSystem system;
	private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
	UserAccount userAccount;
	Enterprise enterprise;
	Organization organization;
	Network network;
	private Customer customer;

	/**
	 * Creates new form MainJFrame
	 */
	public MainJFrame() {

		this.setUndecorated(true);
		initComponents();
		system = dB4OUtil.retrieveSystem();
		EcoSystem.setInstance(system);
		LoginPanel.setVisible(true);
		container.setVisible(false);
		this.customer = customer;

		getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

	}

	private void changePanel1() {

		if (userAccount != null && userAccount.getRole() != null) {
			String greetings = "Hi";
			if (userAccount.getRole() instanceof Customer) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof MaintenanceAdmin) {
				greetings = greetings + " " + userAccount.getUsername();

				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof CleaningAdmin) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof SparePartsAdmin) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof BodyShopHead) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
//                  System.out.println("organization name" + organization.getName());
			} else if (userAccount.getRole() instanceof MechanicHead) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof CleanerInteriorHead) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof SparePartsSalesHead) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof AccountsAdmin) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else if (userAccount.getRole() instanceof SparePartsInstallerHead) {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			} else {
				greetings = greetings + " " + userAccount.getUsername();
				container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, organization,
						enterprise, network, system));
			}
			greetingUserLabel.setText(greetings + " !!!");
			CardLayout layout = (CardLayout) container.getLayout();
			layout.next(container);
		}

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		MainFrameHeader = new javax.swing.JPanel();
		greetingUserLabel = new javax.swing.JLabel();
		btnLogoutLabel = new javax.swing.JLabel();
		btnBackLabel = new javax.swing.JLabel();
		container = new javax.swing.JPanel();
		LoginPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		TFLoginUserName = new javax.swing.JTextField();
		PasswordField = new javax.swing.JPasswordField();
		BtnLogin = new javax.swing.JButton();
		BtnRegisterLogin = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		MainFrameHeader.setBackground(new java.awt.Color(0, 51, 153));
		MainFrameHeader.setPreferredSize(new java.awt.Dimension(1360, 60));
		MainFrameHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
		MainFrameHeader.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

		btnLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shutdown-30.png"))); // NOI18N
		btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnLogoutLabelMousePressed(evt);
			}
		});
		MainFrameHeader.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 70, 60));

		btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnBackLabelMousePressed(evt);
			}
		});
		MainFrameHeader.add(btnBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 60, 60));

		getContentPane().add(MainFrameHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 80));

		container.setLayout(new java.awt.CardLayout());
		getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1360, 720));

		LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginBackground.jpeg"))); // NOI18N

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (6).png"))); // NOI18N

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house-key (1).png"))); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(18, 18, 18)
								.addComponent(TFLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(18, 18, 18)
								.addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(79, Short.MAX_VALUE)));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { PasswordField, TFLoginUserName });

		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel2).addComponent(TFLoginUserName,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel3).addComponent(PasswordField,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));

		BtnLogin.setBackground(new java.awt.Color(0, 51, 153));
		BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		BtnLogin.setForeground(new java.awt.Color(255, 0, 51));
		BtnLogin.setText("Login");
		BtnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BtnLoginActionPerformed(evt);
			}
		});

		BtnRegisterLogin.setBackground(new java.awt.Color(0, 51, 153));
		BtnRegisterLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		BtnRegisterLogin.setForeground(new java.awt.Color(255, 0, 51));
		BtnRegisterLogin.setText("Register");
		BtnRegisterLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BtnRegisterLoginActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
		LoginPanel.setLayout(LoginPanelLayout);
		LoginPanelLayout.setHorizontalGroup(LoginPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(LoginPanelLayout.createSequentialGroup()
						.addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(LoginPanelLayout.createSequentialGroup().addGap(27, 27, 27).addComponent(
										jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(LoginPanelLayout.createSequentialGroup().addGap(79, 79, 79)
										.addGroup(LoginPanelLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(BtnRegisterLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
														118, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(204, 204, 204).addComponent(jLabel1).addGap(405, 405, 405)));
		LoginPanelLayout.setVerticalGroup(LoginPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(LoginPanelLayout.createSequentialGroup().addGroup(LoginPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(LoginPanelLayout.createSequentialGroup().addGap(155, 155, 155).addComponent(jLabel1))
						.addGroup(LoginPanelLayout.createSequentialGroup().addGap(96, 96, 96)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(BtnLogin).addGap(18, 18, 18).addComponent(BtnRegisterLogin)))
						.addGap(155, 155, 155)));

		getContentPane().add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 800));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void BtnRegisterLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnRegisterLoginActionPerformed

		// TODO add your handling code here:
		RegisterUser panel = new RegisterUser(container, system);
		greetingUserLabel.setText("WELCOME NEW MEMBER  REGISTRATION!!!");
		// emoRR panel = new demoRR(container, system);
		// container.add("UserRegistrationJPanel", panel);
		LoginPanel.setVisible(false);
		container.setVisible(true);
		MainFrameHeader.setVisible(true);
		btnLogoutLabel.setVisible(true);
		btnBackLabel.setVisible(true);
		TFLoginUserName.setText("");
		PasswordField.setText("");
		// cc();
		// SystemAdminRole r = new SystemAdminRole();
		container.add("workArea", panel);
		CardLayout layout = (CardLayout) container.getLayout();
		layout.next(container);
	}// GEN-LAST:event_BtnRegisterLoginActionPerformed

	private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogoutLabelMousePressed
		logout();
	}// GEN-LAST:event_btnLogoutLabelMousePressed

	private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBackLabelMousePressed
		// TODO add your handling code here:
		logout();
	}// GEN-LAST:event_btnBackLabelMousePressed

	private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnLoginActionPerformed
		// TODO add your handling code here:
		String userName = TFLoginUserName.getText();
		char[] passwordCharArray = PasswordField.getPassword();
		String password = String.valueOf(passwordCharArray);

		userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
		enterprise = null;
		organization = null;
		network = null;

		if (userAccount == null) {
			for (Network network : system.getNetworkList()) {
				// Step 2.a: check against each enterprise
				System.out.println("Network name --->> " + network.getName());
				for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
					System.out.println("Enterprise name --->> " + enterprise.getName());
					userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
					this.network = network;
					if (userAccount == null) {
						// Step 3:check against each organization for each enterprise
						for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
							userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
							if (userAccount != null) {
								this.enterprise = enterprise;
								this.organization = organization;
								break;
							}
						}

					} else {
						this.enterprise = enterprise;
						break;
					}
					if (organization != null) {
						break;
					}
				}
				if (enterprise != null) {
					break;
				}
				/*
				 * if (network != null) {//changed break; }
				 */
			}
		}
		if (userAccount == null) {
			JOptionPane.showMessageDialog(null, "Invalid credentials");
			return;
		} else {
			LoginPanel.setVisible(false);
			container.setVisible(true);
			MainFrameHeader.setVisible(true);
			btnLogoutLabel.setVisible(true);
			btnBackLabel.setVisible(false);
			TFLoginUserName.setText("");
			PasswordField.setText("");
			changePanel1();
		}
	}// GEN-LAST:event_BtnLoginActionPerformed

	private void logout() {
		container.removeAll();
		dB4OUtil.storeSystem(system);
		LoginPanel.setVisible(true);
		container.setVisible(false);
		MainFrameHeader.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainJFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BtnLogin;
	private javax.swing.JButton BtnRegisterLogin;
	private javax.swing.JPanel LoginPanel;
	private javax.swing.JPanel MainFrameHeader;
	private javax.swing.JPasswordField PasswordField;
	private javax.swing.JTextField TFLoginUserName;
	private javax.swing.JLabel btnBackLabel;
	private javax.swing.JLabel btnLogoutLabel;
	private javax.swing.JPanel container;
	private javax.swing.JLabel greetingUserLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
