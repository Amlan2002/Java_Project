package Java_projects.BitManpulation;

import java.util.Scanner;

//check the given number is divisible by 8 or not
// check the last three digit are 0
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&7)==0){
            System.out.println("Yes");
        } else{
            System.out.println("NO");
        }
        sc.close();
    }
}

