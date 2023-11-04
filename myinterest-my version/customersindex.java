package thecustomer;

import java.util.Scanner;

public class customersindex {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("What is your name");
        String index1 = in.next();

        System.out.println("What do you love doing in your spare time");
        String index2 = in.next();

        Index index = new Index();
        index.setName(index1);
        index.setInterest(index2);

        System.out.println(index.getName() + " loves " + index.getInterest());

    }
}
