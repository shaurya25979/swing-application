/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import java.util.ArrayList;

import Business.Role.BodyShopHead;
import Business.Role.Role;

/**
 *
 * @author shaur
 */
public class BodyShop extends Organization{
     private String bodyShop;
    
    public BodyShop(String name) {
        super(name);
        bodyShop = name;
        //setType(Organization.Type.FireSafety);
    }

    public String getBodyShop() {
        return bodyShop;
    }

    public void setBodyShop(String bodyshop) {
        this.bodyShop = bodyshop;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BodyShopHead());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.BodyShop;
    }  
}

    

