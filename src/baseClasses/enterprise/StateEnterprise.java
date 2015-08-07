/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.network.Network;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class StateEnterprise extends Enterprise
{
    
    private Network stateNetwork;

    public Network getStateNetwork() {
        return stateNetwork;
    }

    public void setStateNetwork(Network stateNetwork) {
        this.stateNetwork = stateNetwork;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public StateEnterprise(String name)
    {
        super(name, EnterpriseType.State);
        stateNetwork = new Network();
    }

    @Override
    public String toString() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
