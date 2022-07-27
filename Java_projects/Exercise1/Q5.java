package Java_projects.Exercise1;

import java.util.Scanner;

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. 


public class Q5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            eligibleForVoteCheck(age);
            sc.close();
    }

    private static void eligibleForVoteCheck(int age) {
        if(age > 18) {
            System.out.println("Hurrayyyy!, Eligible for vote!!");
        } else{
            System.out.println("Not Eligible for vote!!");
        }
    }
}
