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

import baseClasses.Address;
import baseClasses.person.PersonDirectory;
import baseClasses.roles.Role;
import baseClasses.userAccount.UserAccountDirectory;
import java.util.ArrayList;
import workQueue.WorkQueue;

/**
 *
 * @author Abhishek
 */
public abstract class Organization
{
    protected String name;
    private WorkQueue workQueue;    
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private int organizationID;
    private static int counter;
    private Address address;

    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
     public enum Type{
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Patient("Patient Organization"),
        Pharmacy("Pharmacy Organization"),
        PharmaceuticalCompany("Pharmaceutical Company Organization"),
        Manufacturing("Manufacturing Organization"),
        Citizen("Citizen Organization"),
        Lab("Lab Organization"),
        DrugAdmin("Drug Admin Organization"),
        Distributor("Distributor Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }
    
    public Organization(String name)
    {
        ++organizationID;
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
        workQueue = new WorkQueue();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
//
    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
