package Java_projects.BitManpulation;

import java.util.Scanner;

//n=5 => 1^2^3^4^5
//n=4 => 1^2^3^4
//without using any loop

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 == 1){
            System.out.println("1");
        }
        else if(n%4==2){
            System.out.println(n+1);
        }
        else if(n%4==3){
            System.out.println("0");
        }
        else if(n%4==0){
            System.out.println(n);
        }
        sc.close();
    }
}

