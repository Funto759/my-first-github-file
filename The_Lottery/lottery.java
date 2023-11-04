package The_Lottery;

import java.util.Random;
import java.util.Scanner;

public class lottery {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_Number = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lottery picks " );   // the The_Lottery.lottery picks are chosen
        String count = scanner.nextLine();
        String[] array = count.split("\\s+"); // prints the numbers a strings in an array
        int[] integers = new int[array.length];  // it returns the length of the array

        for (int i = 0; i < array.length; i++) {
            integers[i] = Integer.parseInt(array[i]);
        }

        if (array.length > 6) {             // the picks should not exceed 6
            System.out.println("You have picked more than 6 lottery picks, try again");
        } else {
            System.out.println("You have entered the following lottery picks: " + arrayToString(integers));

            scanner.close();
        }
        int[] ticket = generateNumbers();
        System.out.println("The The_Lottery.lottery tickets that have won are :  " + arrayToString(ticket));
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_Number) + 1;
        }
        return ticket;
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(" , ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
