/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SparePartsSalesHead;

/**
 *
 * @author shaur
 */
public class SparePartsSales extends Organization {
	private String sparepartssales;

	public String getSparepartssales() {
		return sparepartssales;
	}

	public void setSparepartssales(String sparepartssales) {
		this.sparepartssales = sparepartssales;
	}

	public SparePartsSales(String name) {
		super(name);
	}

	@Override
	public ArrayList<Role> getSupportedRole() {
		roles = new ArrayList<>();
		roles.add(new SparePartsSalesHead());
		return roles;
	}

	public Organization.Type getType() {
		return Organization.Type.SparePartsSales;

	}

}
