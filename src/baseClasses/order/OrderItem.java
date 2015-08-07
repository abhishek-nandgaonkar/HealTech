/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.order;

import baseClasses.medicine.Medicine;

/**
 *
 * @author Abhishek
 */
public class OrderItem {

    private Medicine medicine;
    private int quantity;
    private float price;
    private int ID=0;
    
    public OrderItem(Medicine medicine, int quantity, float price) {
        this.medicine = medicine;
        this.quantity = quantity;
        this.price = price;
        //this.ID = product.getModelNumber();
    }
    
    public OrderItem()
    {
        
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    
    public String toString()
    {
        return null;
    }
    
    
    
    
    
}
