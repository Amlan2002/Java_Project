package Recursion;
import java.util.*;
public class PrintSubSeqSumIsKOnly1Output {
    public static boolean printS(int idx, ArrayList<Integer> l,int arr[],int sum,int k){
        if(idx == arr.length) {
            if(sum == k){
                System.out.println(l);
                return true;
            }
         return false;
        }
        // take the element 
        l.add(arr[idx]);
        sum += arr[idx];
        if(printS(idx+1,l,arr,sum,k) == true) return true;
        l.remove(l.size() - 1);
        sum -= arr[idx];
 
        //for not take the element
        if(printS(idx+1,l,arr,sum,k) == true) return true;

        return false;
     }
     public static void main(String[] args) {
         int arr[] = {1,2,1};
         int k = 2;
         int sum = 0;
         ArrayList<Integer> l = new ArrayList<Integer>();
         printS(0,l,arr,sum,k);
     }
}
