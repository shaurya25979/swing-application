/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.Workqueue.ServiceRequestDirectory;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    CustomerDirectory customerDirectory;
    
    private ServiceRequestDirectory serviceDirectory;

    public UserAccount() {
        serviceDirectory = new ServiceRequestDirectory();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    

    public ServiceRequestDirectory getServiceDirectory() {
        if(serviceDirectory == null){
            serviceDirectory = new ServiceRequestDirectory();
        }
        return serviceDirectory;
    }

    public void setServiceDirectory(ServiceRequestDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    

    
    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}