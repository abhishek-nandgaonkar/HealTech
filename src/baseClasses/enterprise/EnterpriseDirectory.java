/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.Address;
import baseClasses.enterprise.Enterprise.EnterpriseType;
import baseClasses.roles.Role;
import baseClasses.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class EnterpriseDirectory
{
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String username, String password, Role role, String status, Address address)
    {
         Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital)
        {
            enterprise = new HospitalEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.City)
        {
            
            enterprise = new CityEnterprise(name);
            UserAccount admin = new UserAccount();
            enterprise.setAddress(address);
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Country)
        {
            enterprise = new CountryEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
        else if(type == Enterprise.EnterpriseType.State)
        {
            enterprise = new StateEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
         else if(type == Enterprise.EnterpriseType.Country)
        {
            enterprise = new CountryEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
        else if(type == Enterprise.EnterpriseType.Government)
        {
            enterprise = new GovernmentEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
        else if(type == Enterprise.EnterpriseType.HealTechLocal)
        {
            enterprise = new HealTechLocalEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
         else if(type == Enterprise.EnterpriseType.Manufacturing)
        {
            enterprise = new ManufacturingEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }   
         else if(type == Enterprise.EnterpriseType.PharmaceuticalCompany)
        {
            enterprise = new PharmaceuticalCompanyEnterprise(name);
            enterprise.setAddress(address);
            System.out.println("Pharmaceutical Company constructor called from Enterprise directory");
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }     
          else if(type == Enterprise.EnterpriseType.Pharmacy)
        {
            enterprise = new PharmacyEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }       
          else if(type == Enterprise.EnterpriseType.FDA)
        {
            System.out.println("Printing while adding FDA" + name + username + password);
            
            enterprise = new FDAEnterprise(name);
            enterprise.setAddress(address);
            UserAccount admin = new UserAccount();
            admin.setUsername(username);
            admin.setPassword(password);
            admin.setRole(role);
            admin.setStatus(status);
            enterprise.getUserAccountDirectory().getUserAccountList().add(admin);
            enterpriseList.add(enterprise);
        }    
        return enterprise;
    }
    
    public Enterprise getEnterprise(EnterpriseType enterpriseType)
    {
        
        EnterpriseType[] enterprises = Enterprise.EnterpriseType.values();
        for(Enterprise enterprise: enterpriseList)
        {
            for(EnterpriseType enterprisetype: enterprises)
            {
                if(enterprise.getEnterpriseType().equals(enterpriseType))
                {
                    return enterprise;
                }
            }
        }
        return null;
    }
}
