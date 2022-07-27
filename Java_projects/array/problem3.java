package Java_projects.array;

import java.util.Scanner;

//Take an array of num as input and check if it is an array sorted in ascending order.
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for(int i =0;i<size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;
        //output
        for(int i=0; i<num.length-1; i++) { // NOTICE num.length - 1 as termination condition
            if(num[i] > num[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
 
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 

        //close scanner class to prevent memory leak
        sc.close();
    }
}
