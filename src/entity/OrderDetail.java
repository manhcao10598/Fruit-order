/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ManhNga
 */
public class OrderDetail extends Order {
    private String customerName;
    private double total;
    public OrderDetail() {
    }

    public OrderDetail(String customerName, double total, String productName, double quantity, double price, double amount) {
        super(productName, quantity, price, amount);
        this.customerName = customerName;
        this.total = total;
    }

    public OrderDetail(String customerName, double total) {
        this.customerName = customerName;
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString(){
        return String.format(customerName +  "|" + total);
    }
    
    
    
}

