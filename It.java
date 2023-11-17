import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int index1 = in.nextInt();
        isEven(index1);

    }
    private static void isEven(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else
            System.out.println(num + " is odd");
        {


        }
    }

}