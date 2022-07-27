package Java_projects.example;
import java.util.Scanner;

//Acsept int array with target . if any subset is giving the target return true or false;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(solve(0, n, arr,target));
        sc.close();
    }

    public static boolean solve(int index , int n , int[] arr , int target){
        if(index==n  || target<0){
            return false;
        }
        if(target==0)
            return true;
        return solve(index+1, n, arr, target) || solve(index+1, n, arr, target-arr[index]);
    }
}