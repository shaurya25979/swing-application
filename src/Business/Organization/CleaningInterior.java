/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.CleanerInteriorHead;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class CleaningInterior extends Organization {
	private String cleaninginterior;

	public String getCleaninginterior() {
		return cleaninginterior;
	}

	public void setCleaninginterior(String cleaninginterior) {
		this.cleaninginterior = cleaninginterior;
	}

	public CleaningInterior(String name) {
		super(name);
	}

	@Override
	public ArrayList<Role> getSupportedRole() {
		roles = new ArrayList();
		roles.add(new CleanerInteriorHead());
		return roles;
	}

	public Organization.Type getType() {
		return Organization.Type.CleaningInterior;
	}
}
