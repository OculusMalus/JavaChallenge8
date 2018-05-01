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
public class Customer extends Person {
    
    private String customerNumber;
    private boolean mailingList;

    public Customer(String n, String a, String p) {
        
        super(n, a, p);
        customerNumber = p.substring(0,4) + n.substring(0,4); 
        mailingList = true;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
    
    

    @Override
    public String toString(){
    
        String person = (this.getName() + " " + this.getAddress() + " " + this.getPhone() + " Customer#: " + customerNumber);
        return person;
    }
    
}