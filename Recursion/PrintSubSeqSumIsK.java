package Recursion;
import java.util.*;
public class PrintSubSeqSumIsK {
    public static void printS(int idx, ArrayList<Integer> l,int arr[],int sum,int k){
        if(idx == arr.length) {
            if(sum == k){
                System.out.println(l);
            }
         return;
        }
        // take the element 
        l.add(arr[idx]);
        sum += arr[idx];
        printS(idx+1,l,arr,sum,k);
        l.remove(l.size() - 1);
        sum -= arr[idx];
 
        //for not take the element
        printS(idx+1,l,arr,sum,k);
     }
     public static void main(String[] args) {
         int arr[] = {1,2,1};
         int k = 2;
         int sum = 0;
         ArrayList<Integer> l = new ArrayList<Integer>();
         printS(0,l,arr,sum,k);
     }
}
