/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.order;

import baseClasses.medicine.Medicine;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class Order
{
    private ArrayList<OrderItem> orderItemList;
    private int orderID;
    private static int count;
   private int total=0;
    
    public Order()
    {
        orderID = count++;
        orderItemList = new ArrayList<OrderItem>();
        
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    
    public OrderItem addOrderItem(Medicine product, int quantity, int price)
    {
        OrderItem orderItem = new OrderItem(product, quantity, price);
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void removeOrderItem(OrderItem orderItem)
    {
        orderItemList.remove(orderItem);
    }

    public void setTotal(int total)
    {
        this.total = total;
        
    }
    
    public int getTotal()
    {
        return total;
    }
    
}
