/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.data.builder;

import com.vm.data.Network;
import com.vm.data.TreeNode;

/**
 *
 * @author hp
 */
abstract public class DataBuilder {
    
    Network network ;
    
    abstract public void buildPart(TreeNode tn) ;
    
}
