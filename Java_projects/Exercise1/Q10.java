package Java_projects.Exercise1;

import java.util.Scanner;

//Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  firstTerm = 0;
        int  secondTerm = 1;
        for(int i = 0; i<=num; i++){
            System.out.println(firstTerm+", ");
            //compute nextTerm
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        sc.close();
    }
}
