package Recursion;
import java.util.*;

public class PrintingSubsequences {
    public static void printS(int idx, ArrayList<Integer> l,int arr[],int n){
       if(idx == n) {
        System.out.println(l);
        return;
       }
       // take the element 
       l.add(arr[idx]);
       printS(idx+1,l,arr,n);
       l.remove(l.size() - 1);

       //for not take the element
       printS(idx+1,l,arr,n);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = 3;
        ArrayList<Integer> l = new ArrayList<Integer>();
        printS(0,l,arr,3);
    }
}
