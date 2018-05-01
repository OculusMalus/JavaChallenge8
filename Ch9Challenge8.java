/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9challenge8;

import java.util.*;

/**
 *
 * @author snance
 */
public class Ch9Challenge8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, address, phone;
        int temp;
        double totalSpent;
        Scanner keyboard = new Scanner(System.in);

        
        System.out.print("Please enter your first and last name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your address: ");
        address = keyboard.nextLine();

        System.out.print("Please enter your phone number: ");
        phone = keyboard.nextLine();
        
        System.out.print("Please enter total purchases made: ");
        totalSpent = keyboard.nextDouble();

        PreferredCustomer customer1 = new PreferredCustomer(name, address, phone, totalSpent);
        
        

        PreferredCustomer customer2 = new PreferredCustomer("Stephanie Nance", "1015 S. 75th", "316-651-7144", 2000.05);
        
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
    
}
