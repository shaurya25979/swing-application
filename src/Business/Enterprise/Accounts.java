/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class Accounts extends Enterprise {

    public Accounts(String name, EnterpriseType type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          return null;  
        }
    
}
