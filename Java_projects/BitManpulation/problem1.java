package Java_projects.BitManpulation;

import java.util.Scanner;

// Write a program to find if a number is a power of 2 or not.
public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPowerofTwo(num)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean isPowerofTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;

    }
}
