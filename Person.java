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
public class Person {
    
    private String name;
    private String address;
    private String phone;

    public Person(String n, String a, String p) {
        name = n;
        address = a;
        phone = p;
    }

    public Person() {
        
    }
    
    @Override
    public String toString(){
        String person = (name + " " + address + " " + phone);
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
    
    
}
