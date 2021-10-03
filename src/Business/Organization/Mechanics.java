/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.MechanicHead;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class Mechanics extends Organization {
    private String mechanics;

    public String getMechanics() {
        return mechanics;
    }

    public void setMechanics(String mechanics) {
        this.mechanics = mechanics;
    }

    public Mechanics(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles.add(new MechanicHead());
        return roles;    
    }
    public Organization.Type getType() {
    return Organization.Type.Mechanic;

}
    
    
    
}
