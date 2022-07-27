package DP_Stirver_Series;

import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int dp[] = new int[n+1];
    System.out.println(f(n,dp));
    sc.close();
   }

public static int f(int n, int[] dp) {
    if(n<=1) return n;
    if(dp[n] != -1) return dp[n];
    
    return dp[n] = f(n-1,dp) + f(n-2,dp);
} 
}
