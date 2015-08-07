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
package workQueue;

import baseClasses.medicine.Medicine;
import baseClasses.order.Order;
import baseClasses.organization.ManufacturingOrganization;

/**
 *
 * @author Abhishek
 */
public class MedicineOrderRequest extends WorkRequest
{
    private String testResult;
    private Medicine medicine;
    private float totalCost;
    private int quantity;
    private ManufacturingOrganization manufacturer;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ManufacturingOrganization getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturingOrganization manufacturer) {
        this.manufacturer = manufacturer;
    }



   

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Override
//    public String toString() {
//        return Integer.toString(order.getOrderID()); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
}
