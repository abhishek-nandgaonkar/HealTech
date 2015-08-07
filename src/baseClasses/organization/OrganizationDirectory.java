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
package baseClasses.organization;

import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.organization.Organization.Type;
import baseClasses.person.Person;
import baseClasses.roles.Role;
import baseClasses.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class OrganizationDirectory
{

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList();
    }
    
    
    
        public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
         public Organization createAndAddOrganization(String name, Organization.Type type, String username, String password, Role role, String status,Person person)
         {
             Organization organization = null;
             
             if(type == Organization.Type.Manufacturing)
             {
                 System.out.println("Printing from Org Directory add manu");
                 organization = new ManufacturingOrganization(name);
                 //enterprise = new HospitalEnterprise(name);
                UserAccount admin = new UserAccount();
                admin.setUsername(username);
                admin.setPassword(password);
                admin.setRole(role);
                admin.setStatus(status);
                admin.setPerson(person);
                organization.getUserAccountDirectory().getUserAccountList().add(admin);
                 
                //enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
                //enterpriseList.add(enterprise);
                organizationList.add(organization);
                System.out.println("org added to manu");
             }
             else if(type == Organization.Type.Distributor)
             {
                 organization = new DistributorOrganization(name);
                 //enterprise = new HospitalEnterprise(name);
                UserAccount admin = new UserAccount();
                admin.setUsername(username);
                admin.setPassword(password);
                admin.setRole(role);
                admin.setStatus(status);
                admin.setPerson(person);
                organization.getUserAccountDirectory().getUserAccountList().add(admin);
                //enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
                //enterpriseList.add(enterprise);
                organizationList.add(organization);
             }
             
             return organization;
         }
        
}
