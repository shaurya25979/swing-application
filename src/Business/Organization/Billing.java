/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Cashier;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class Billing extends Organization{
    private String billing;

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public Billing(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Cashier());
        return roles;
    }
    public Type getType() {
        return Organization.Type.Billing;
    }
    
}
