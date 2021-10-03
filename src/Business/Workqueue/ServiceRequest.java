/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.UserAccount.UserAccount;

/**
 *
 * @author shaur
 */
public class ServiceRequest  {
    private String regno;
    private Network customercity;
    private String make;
    private String model;
    private String modelyear;
    private EnterpriseType enterprisetype;
    private String description;
    private String name;
    private UserAccount sender;
    private String requestid;
    
    private String status;
    int min = 100;
    int max = 999;
    public ServiceRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        requestid = "SR"+randomNum;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }
    
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelyear() {
        return modelyear;
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }

    public EnterpriseType getEnterprisetype() {
        return enterprisetype;
    }

    public void setEnterprisetype(EnterpriseType enterprisetype) {
        this.enterprisetype = enterprisetype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Network getCustomercity() {
        return customercity;
    }

    public void setCustomercity(Network customercity) {
        this.customercity = customercity;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }
    
    
    
    
    
    
}
