/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Workqueue.ServiceRequestDirectory;

/**
 *
 * @author shaur
 */
public class Customer {
    
    private String name;
    private String userName;
    private String password;
    private String phoneNum;
    private String email;
    private String regNo;
    private String licenseNo;
    private String city;
    private String state;
    ServiceRequestDirectory serviceRequestDirectory;

    public Customer(String name) {
        this.name = name;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.password = password;
        this.email = email;
        this.regNo = regNo;
        this.licenseNo = licenseNo;
        this.city = city;
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ServiceRequestDirectory getServiceRequestDirectory() {
        if(serviceRequestDirectory == null){
            serviceRequestDirectory = new ServiceRequestDirectory();
        }
        return serviceRequestDirectory;
    }

    public void setServiceRequestDirectory(ServiceRequestDirectory serviceRequestDirectory) {
        this.serviceRequestDirectory = serviceRequestDirectory;
    }
    
    
    
}
