/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public abstract class Role
{
    public abstract JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise,
                                                                            CityEnterprise inCityEnterprise);
    
    public enum RoleType
    {
        ADMIN("Admin"),
        DOCTOR("Doctor"),
        CITIZEN("Citizen"),
        MANUFACTURER("Manufacturer"),
        PHARMACY("Pharmacy"),
        PHAMACEUTICALCOMPANY("Pharmaceutical Company"),
        NURSE("Nurse"),
        LABASSISTANT("LabAssistant"),
        SYSTEMADMIN("SystemAdmin"),
        FDA("FDA"),
        DRUGADMIN("Drug Admin"),
        COUNTRY("Country");
        
        private String value;
        
        private RoleType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public String toString()
    {
        return this.getClass().getName();
        
    }
}
