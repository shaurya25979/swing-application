/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Organization.Organization.Type;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.BodyShop.getValue())) {
            organization = new BodyShop(name);
            BodyShop bodyShop = (BodyShop) organization;
            bodyShop.setBodyShop(name);
            organizationList.add(organization);
        }  else if (type.getValue().equals(Type.Mechanic.getValue())) {
            organization = new Mechanics(name);
            Mechanics mechanics = (Mechanics) organization;
            mechanics.setMechanics(name);
            
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CleaningExterior.getValue())) {
            organization = new CleaningExterior(name);
            CleaningExterior cleaningexterior = (CleaningExterior) organization;
            cleaningexterior.setCleaningexterior(name);
            
            
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CleaningInterior.getValue())) {
            organization = new CleaningInterior(name);
            CleaningInterior cleaninginterior = (CleaningInterior) organization;
            cleaninginterior.setCleaninginterior(name);
            
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SparePartsInstaller.getValue())) {
            organization = new SparePartsInstaller(name);
            SparePartsInstaller sparepartsinstaller = (SparePartsInstaller) organization;
            sparepartsinstaller.setSparepartsinstaller(name);
            
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SparePartsSales.getValue())) {
            organization = new SparePartsSales(name);
            SparePartsSales sparepartssales = (SparePartsSales) organization;
            sparepartssales.setSparepartssales(name);
            
            organizationList.add(organization);
        }  else if (type.getValue().equals(Type.Billing.getValue())) {
            organization = new Billing(name);
            Billing billing = (Billing) organization;
            billing.setBilling(name);
            
            organizationList.add(organization);
        } 

        return organization;
    }
}
