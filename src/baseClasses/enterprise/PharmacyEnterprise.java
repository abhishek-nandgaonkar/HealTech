/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.medicine.Medicine;
import baseClasses.order.Order;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PharmacyEnterprise extends Enterprise
{

    private ArrayList<Medicine> medicineList;
    private ArrayList<Order> orderList;

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
        
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    
    
    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public PharmacyEnterprise(String name)
    {
        super(name, EnterpriseType.Pharmacy);
        medicineList = new ArrayList();
        orderList = new ArrayList();
    }
}
