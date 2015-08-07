/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.network;

import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.EnterpriseDirectory;


/**
 *
 * @author Abhishek
 */
public class Network
{
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network()
    {
        enterpriseDirectory = new EnterpriseDirectory();
        
    }

    public String getName() {
        return name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
