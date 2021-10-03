/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Workqueue.ServiceRequestDirectory;

/**
 *
 * @author raunak
 */
public abstract class Organization {

	private String name;
	private ServiceRequestDirectory servicedirectory;
	private EmployeeDirectory employeeDirectory;
	private UserAccountDirectory userAccountDirectory;
	private CustomerDirectory customerDirectory;
	private int organizationID;
	private static int counter = 0;
	public ArrayList<Role> roles;
	private Type type;

	public enum Type {

		BodyShop("BodyShop"), Mechanic("Mechanic"), CleaningExterior("CleaningExterior"),
		CleaningInterior("CleaningInterior"), SparePartsSales("SparePartsSales"),
		SparePartsInstaller("SparePartsInstaller"), Billing("Billing");

		private String value;

		private Type(String value) {
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

	public Organization(String name) {
		this.name = name;
		servicedirectory = new ServiceRequestDirectory();
		employeeDirectory = new EmployeeDirectory();
		userAccountDirectory = new UserAccountDirectory();
		organizationID = counter;
		roles = new ArrayList<Role>();
		++counter;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public CustomerDirectory getCustomerDirectory() {
		if (customerDirectory == null) {
			customerDirectory = new CustomerDirectory();
		}
		return customerDirectory;
	}

	public void setCustomerDirectory(CustomerDirectory customerDirectory) {
		this.customerDirectory = customerDirectory;
	}

	public abstract ArrayList<Role> getSupportedRole();

	public UserAccountDirectory getUserAccountDirectory() {
		return userAccountDirectory;
	}

	public int getOrganizationID() {
		return organizationID;
	}

	public EmployeeDirectory getEmployeeDirectory() {
		return employeeDirectory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceRequestDirectory getServicedirectory() {
		return servicedirectory;
	}

	public void setServicedirectory(ServiceRequestDirectory servicedirectory) {
		this.servicedirectory = servicedirectory;
	}

	@Override
	public String toString() {
		return name;
	}

}
