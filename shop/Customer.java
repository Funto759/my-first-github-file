package shop;

import java.awt.*;
import java.util.List;

public class Customer {
    private String name;
    private List<String> interest;

    public Customer() {
    }
    public Customer(String name, List<String> interest){
        this.name = name;
        this.interest = interest;
    }
    public void returnItem(String item){
        System.out.println("i would like to return" + item + ".");

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getInterest() {
        return interest;
    }
    public void setInterest(List<String> interest) {
        this.interest = interest;
    }
}
