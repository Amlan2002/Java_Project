package Java_projects.Exercise1;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number returns the greater of those two.");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        printGreaterNum(num1,num2);
        sc.close();
    }

    private static void printGreaterNum(int num1, int num2) {
        if(num1 < num2){
            System.out.println(num2 + " is greater than "+ num1);
        } else if(num2 < num1){
            System.out.println(num1 + " is greater than "+ num2);
        } else {
            System.out.println("The two input numbers are same!!");
        }
    }
}
