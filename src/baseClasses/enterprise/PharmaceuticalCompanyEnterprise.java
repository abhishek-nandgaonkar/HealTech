/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.Drug;
import baseClasses.medicine.Medicine;
import baseClasses.order.Order;
import baseClasses.organization.DistributorOrganization;
import baseClasses.organization.ManufacturingOrganization;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PharmaceuticalCompanyEnterprise extends Enterprise
{
    private ArrayList<Drug> drugList;
    private ManufacturingOrganization manufacturingOrganization;
    private DistributorOrganization distributorOrganization;
    private ArrayList<Medicine> medicineList;
    private ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    

    public ManufacturingOrganization getManufacturingOrganization() {
        return manufacturingOrganization;
    }

    public void setManufacturingOrganization(ManufacturingOrganization manufacturingOrganization) {
        this.manufacturingOrganization = manufacturingOrganization;
    }

    public DistributorOrganization getDistributorOrganization() {
        return distributorOrganization;
    }

    public void setDistributorOrganization(DistributorOrganization distributorOrganization) {
        this.distributorOrganization = distributorOrganization;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
    
    public void addDrug(Drug drug)
    {
        System.out.println("/****************************************************Printing from PharmaceuticalCompanyEnterprise");
        System.out.println(drugList);
        System.out.println(drug);
        drugList.add(drug);
    }

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public PharmaceuticalCompanyEnterprise(String name)
    {
        
        super(name, EnterpriseType.PharmaceuticalCompany);
        manufacturingOrganization = new ManufacturingOrganization("");
        distributorOrganization = new DistributorOrganization("");
        this.getOrganizationDirectory().getOrganizationList().add(manufacturingOrganization);
        this.getOrganizationDirectory().getOrganizationList().add(distributorOrganization);
        drugList = new ArrayList();
        medicineList = new ArrayList();
        orderList = new ArrayList();
    }
}
