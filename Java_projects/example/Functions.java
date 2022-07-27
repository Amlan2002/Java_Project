package Java_projects.example;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        // Make a function to check if a number is prime or not.
        // Make a function to check if a given number n is even or not.
        // Make a function to print the table of a given number n.
        // Read about Recursion.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not!");
        int num = sc.nextInt();
        boolean flag = false;
        checkPrimeNumber(num, flag);
        System.out.println("==============Check Even or Odd====================");
        checkEvenOdd(num);
        System.out.println("============== print table====================");
        printTable(num);

        sc.close();
    }

    // function to print the table
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // function to check Even or Odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number");
        } else {
            System.out.println(num + " is an Odd Number");
        }
    }

    // function for check prime number
    public static void checkPrimeNumber(int num, boolean flag) {
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                // condition for non prime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

    }
}
