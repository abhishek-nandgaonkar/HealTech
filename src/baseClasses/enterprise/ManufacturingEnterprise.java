/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManufacturingEnterprise extends Enterprise
{

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public ManufacturingEnterprise(String name)
    {
        super(name, EnterpriseType.Manufacturing);
    }
}
