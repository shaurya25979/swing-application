/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SparePartsInstallerHead;

/**
 *
 * @author shaur
 */
public class SparePartsInstaller extends Organization {
	private String sparepartsinstaller;

	public String getSparepartsinstaller() {
		return sparepartsinstaller;
	}

	public void setSparepartsinstaller(String sparepartsinstaller) {
		this.sparepartsinstaller = sparepartsinstaller;
	}

	public SparePartsInstaller(String name) {
		super(name);
	}

	@Override
	public ArrayList<Role> getSupportedRole() {
		roles = new ArrayList<>();
		roles.add(new SparePartsInstallerHead());
		return roles;
	}

	public Organization.Type getType() {
		return Organization.Type.SparePartsInstaller;

	}

}
