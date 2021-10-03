/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.SparePartsSalesAdmin.SparePartsSalesAdminWorkAreaJPanel;

/**
 *
 * @author shaur
 */
public class SparePartsSalesHead extends Role {

	@Override
	public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
			Enterprise enterprise, Network network, EcoSystem business) {
		return new SparePartsSalesAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network,
				business);
	}

	@Override
	public String toString() {
		return (Role.RoleType.SparePartsSalesHead.getValue());
	}

}
