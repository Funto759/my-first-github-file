import java.util.Scanner;

public class project {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println(" What day were you born");
        int index1 = in.nextInt();

        System.out.println(" What month were you born");
        String index4 = in.next();

        System.out.println(" What year were you born");
        int index3 = in.nextInt();

        System.out.println("Your birthday is on the " + index1 + "th of " + index4 + " " + index3 + ".");

    }



}
