package Java_projects.example;
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncresingSubsequenceTabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j= 0;j<i;j++){
                if(arr[j]<arr[i])
                {
                    dp[i]= Math.max(dp[i], 1+dp[j]);
                    if(dp[i]>max){
                        max=dp[i];
                    }
                }
            }
        }
        System.out.println(max);
    }
}