/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9challenge8;

/**
 *
 * @author snance
 */
public class PreferredCustomer extends Customer{
    private double purchaseTotal;
    private double discountLevel;

    public PreferredCustomer(String n, String a, String p, double t) {
        super(n, a, p);
        purchaseTotal = t;
        if (purchaseTotal >= 2000.00){
            discountLevel = 0.10;
        } 
        else if (purchaseTotal >= 1500.00){
            discountLevel = 0.07;
        }
        else if (purchaseTotal >= 1000.00){
            discountLevel = 0.06;
        }
        else if (purchaseTotal >= 500.00){
            discountLevel = 0.05;
        }
        else {
            discountLevel = 0.00;
        }
    }

    public double getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(double purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    
    @Override
    public String toString(){
    
        String person = (this.getName() + " " + this.getAddress() + " " + this.getPhone() + " Customer#: " 
                + this.getCustomerNumber() + " Discount level: " +  this.getDiscountLevel());
        return person;
    }
}    
    

