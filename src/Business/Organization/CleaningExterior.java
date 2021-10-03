/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.CleanerExteriorHead;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class CleaningExterior extends Organization {
	private String cleaningexterior;

	public String getCleaningexterior() {
		return cleaningexterior;
	}

	public void setCleaningexterior(String cleaningexterior) {
		this.cleaningexterior = cleaningexterior;
	}

	public CleaningExterior(String name) {
		super(name);
	}

	@Override
	public ArrayList<Role> getSupportedRole() {
		roles = new ArrayList();
		roles.add(new CleanerExteriorHead());
		return roles;
	}

	public Organization.Type getType() {
		return Organization.Type.CleaningExterior;
	}
}
