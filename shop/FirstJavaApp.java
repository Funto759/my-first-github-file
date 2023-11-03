package shop;

import shop.Customer;

import java.util.Arrays;

public class FirstJavaApp {
    public static void main(String[] args){
        Customer customer = new shop.Customer();
        customer.setName("Funto");
        customer.setInterest(Arrays.asList(" coding"));

        System.out.println(customer.getName() + " loves" + customer.getInterest().get(0));


    }
}
