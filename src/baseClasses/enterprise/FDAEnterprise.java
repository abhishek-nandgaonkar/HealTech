/*
 * Copyright (C) 2014 Abhishek
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package baseClasses.enterprise;

import baseClasses.organization.DrugAdminOrganization;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class FDAEnterprise extends Enterprise
{
    private DrugAdminOrganization drugAdminOrganization;
       @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public FDAEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.FDA);
        drugAdminOrganization = new DrugAdminOrganization();
        this.getOrganizationDirectory().getOrganizationList().add(drugAdminOrganization);
    }

    @Override
    public String toString() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
