package Java_projects.Exercise1;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number: ");
        int x = sc.nextInt();
        System.out.println("enter the power");
        int n = sc.nextInt();
        power(x, n);
        sc.close();
    }

    private static void power(int x, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= x;
        }
        System.out.println("The value is: "+power);
    }
}
