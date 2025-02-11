import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        while(true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter the first number : ");
            int first = sc.nextInt();
            int first_n = first;
            System.out.print("enter the operation do : ");
            String operation = sc.next();

            System.out.print("enter the secound number: ");
            int secound = sc.nextInt();
            int secound_n = secound;

            switch (operation) {
                case "+":
                    System.out.println("the addition is : " + (first_n + secound_n));
                    break;

                case "-":
                    System.out.println("the substraction is : " + (first_n - secound_n));
                    break;

                case "*":
                    System.out.println("the multiplication is : " + (first_n * secound_n));
                    break;

                case "/":
                    System.out.println("the division  is : " + (first_n / secound_n));
                    break;

                case "%":
                    System.out.println("the reminder is : " + (first_n % secound_n));
                    break;


            }

        }
    }
}
