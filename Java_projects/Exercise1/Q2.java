package Java_projects.Exercise1;

import java.util.Scanner;

public class Q2 {

    //Write a function to print the sum of all odd numbers from 1 to n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of odd number from 1 to n");
        int num= sc.nextInt();
        printSumOddNumber(num);
        sc.close();
    }

    private static void printSumOddNumber(int num) {
        int sum = 0;
        for(int i = 1;i<=num; i++){
            if(i % 2 != 0){
                sum = sum + i;
            } 
        }
        System.out.println("The sum of all odd numbers is: "+ sum);
    }

}
