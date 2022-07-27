package Java_projects.BitManpulation;

import java.util.Scanner;

//check the given number is divisible by 4 or not
// check the last two digit are 0
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&3)==0){
            System.out.println("Yes");
        } else{
            System.out.println("NO");
        }
        sc.close();
    }
}
