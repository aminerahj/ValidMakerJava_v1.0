/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.data;

import java.util.List;

/**
 *
 * @author hp
 */
public class Network {
    
    private static Network instance;
    
    private List<GenericService> gsList;
    private List<ServiceInstance> siList;
    private List<ServiceFamily> sfList;
    private List<Rule> rList;   
       
    
    private Network(){
        
    }

    public static Network getInstance() {
        
        if (Network.instance == null) Network.instance = new Network();
        
        return Network.instance;
         
    }
    
    
}
