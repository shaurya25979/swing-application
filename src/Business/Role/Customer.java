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
import Business.Workqueue.ServiceRequestDirectory;
import ui.Customer.CustomerJPanel;

/**
 *
 * @author shaur
 */
public class Customer extends Role{
    ServiceRequestDirectory sd;
    
    
    
     @Override
    public String toString(){
        return (RoleType.Customer.getValue());
    }

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new CustomerJPanel(userProcessContainer, account, network, business, sd);
    }

    
}
