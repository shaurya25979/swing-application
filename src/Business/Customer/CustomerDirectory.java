/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author shaur
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createCustomer(String name){
        Customer customer = new Customer(name);
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
    public Customer findUserByUserName(String username){
        Customer user = null;
        for(Customer usr : customerList){
            if(usr.getUserName().equalsIgnoreCase(username)){
                user=usr;
            }
        }
        return user;
    }
    
}
