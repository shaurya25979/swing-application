/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import java.util.ArrayList;

/**
 *
 * @author shaur
 */
public class ServiceRequestDirectory {
    
    private ArrayList<ServiceRequest> serviceRequestList;

    public ServiceRequestDirectory() {
        serviceRequestList = new ArrayList();
    }

    public ArrayList<ServiceRequest> getServiceRequestList() {
        return serviceRequestList;
    }
    
    public ServiceRequest createRequest(ServiceRequest request){
        if(serviceRequestList == null){
            serviceRequestList = new ArrayList();
        }
        serviceRequestList.add(request);
        return request;
    }
    
    
    
}
