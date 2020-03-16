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
public class Order {
    private String productName;
    private double quantity;
    private double price;
    private double amount;

    public Order() {
    }

    public Order(String productName, double quantity, double price, double amount) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = this.quantity * this.price;
    }
    @Override
    public String toString(){
        return String.format(productName + "|" + quantity + "|" + price + "|" + amount);
    }
    
}
