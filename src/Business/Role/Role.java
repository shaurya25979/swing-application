/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;

/**
 *
 * @author shaur
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public abstract class Role {

	public enum RoleType {
		SystemAdmin("SystemAdmin"), Customer("Customer)"),

		MaintanenceAdmin("MaintanenceAdmin"), BodyShopHead("BodyShopHead"), MechanicHead("MechanicHead"),
		CleaningAdmin("CleaningAdmin"), CleanerExteriorHead("CleanerExteriorHead"),
		CleanerInteriorHead("CleanerInteriorHead"), SparePartsAdmin("SparePartsAdmin"),
		SparePartsSalesHead("SparePartsSalesHead"), SparePartsInstallerHead("SparePartsInstallerHead"),
		AccountsAdmin("AccountsAdmin"), Cashier("Cashier");

		private String value;

		private RoleType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
			Enterprise enterprise, Network network, EcoSystem business);

	@Override
	public String toString() {
		return this.getClass().getName();
	}

}
