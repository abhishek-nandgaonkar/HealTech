/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.Address;
import baseClasses.organization.Organization;
import baseClasses.organization.OrganizationDirectory;


/**
 *
 * @author Abhishek
 */
public abstract class Enterprise extends Organization
{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
       
    public Enterprise(String name, EnterpriseType type)
    {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType
    {
        
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        PharmaceuticalCompany("PharmaceuticalCompay"),
        HealTechLocal("HealTechLocal"),
        Country("Country"),
        State("State"),
        City("City"),
        Government("Government"),
        FDA("FDA"),
        Manufacturing("Manufacturing");
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }

        @Override
        public String toString() {
            return value; //To change body of generated methods, choose Tools | Templates.
        }
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
