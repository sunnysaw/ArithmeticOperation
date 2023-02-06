import java.util.Scanner;

/*
Question : Write a program to perform arithmetic operation on given value.
 */
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        b = sc.nextInt();
        while (true){
            System.out.println("ENTER 1 FOR ADDITION :");
            System.out.println("ENTER 2 FOR SUBTRACTION :");
            System.out.println("ENTER 3 FOR DIVISION :");
            System.out.println("ENTER 4 FOR MULTIPLICATION :");
            System.out.println("ENTER 5 FOR EXIT :");
            c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    int sum = a + b;
                    System.out.println("Printing the result 1: " + sum);
                }
                case 2 -> {
                    int sub = a - b;
                    System.out.println("Printing the result 2: " + sub);
                }
                case 3 -> {
                    int div = a / b;
                    System.out.println("Printing the result 3: " + div);
                }
                case 4 -> {
                    int mul = a * b;
                    System.out.println("Printing the result 4: " + mul);
                }
                case 5 -> System.out.println("TERMINATING LOOP 5: ");
            }
            System.out.println();
        }
    }
}