import java.util.Scanner;

public class learning {
    public static void main(String[] args) {
        Scanner sales = new Scanner(System.in);

        System.out.println("Number of sales achieved");
        int sale = sales.nextInt();
        atBonus(sale);
    }
            private static void atBonus(int x){
                int salary = 25000;
                int bonus = 5000;
                if (x > 10) {
                    System.out.println("your salary is $" + (salary + bonus));
                }else {
                    System.out.println("your salary is $" + salary);
                }
            }




    }




















