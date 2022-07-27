package Java_projects.Exercise1;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        do {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if(num >0 ) {
                positive++;
            } else if(num < 0){
                negative++;
            } else {
                zero++;
            }
            System.out.println("Enter 1 to continue or 0 to exit!!");
            int input = sc.nextInt();
            if (input == 1) {
                n = input;
            } else if (input == 0) {
                break;
            } else {
                System.out.println("Invaild number || Enter 0 or 1 ");
            }
        } while (n == 1);

        System.out.println("The total numbers:");
        System.out.println("Positive Numbers: "+positive);
        System.out.println("Negative Numbers: "+negative);
        System.out.println("Zeros: "+zero);

        sc.close();
    }
}
