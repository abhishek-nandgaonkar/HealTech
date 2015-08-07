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
package baseClasses.medicine;

import baseClasses.Drug;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.organization.ManufacturingOrganization;

/**
 *
 * @author Abhishek
 */
public class Medicine
{
    private String name;
    private Drug drug;
    private ManufacturingOrganization manufacturer;
    private PharmaceuticalCompanyEnterprise pharmaceuticalEnterprise;

    private int quantity;
    private float price;

    public PharmaceuticalCompanyEnterprise getPharmaceuticalEnterprise() {
        return pharmaceuticalEnterprise;
    }

    public void setPharmaceuticalEnterprise(PharmaceuticalCompanyEnterprise pharmaceuticalEnterprise) {
        this.pharmaceuticalEnterprise = pharmaceuticalEnterprise;
    }

    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

 
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ManufacturingOrganization getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturingOrganization manufacturer) {
        this.manufacturer = manufacturer;
    }

    
    

    
    
    
    public Medicine()
    {
        //drugsInvolved = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
