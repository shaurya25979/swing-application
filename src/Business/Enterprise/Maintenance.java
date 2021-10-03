/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

import Business.Role.BodyShopHead;
import Business.Role.MechanicHead;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class Maintenance extends Enterprise{
    public Maintenance(String name) {
        super(name, Enterprise.EnterpriseType.Maintanence);
    }

    /*@Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new ManintanenceAdmin());
        return roles;
    }*/

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new BodyShopHead());
        roles.add(new MechanicHead());
//        roles.add(new MaintenanceAdmin());
        return null;
    }
        
    
}
