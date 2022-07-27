package Java_projects.Exercise1;

import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number for calculate the average");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        printAverage(num1,num2,num3);
        sc.close();
    }

    private static void printAverage(int num1, int num2, int num3) {
        int avg = (num1+num2+num3)/3;
        System.out.println("The Average is: "+avg);
    }
}
