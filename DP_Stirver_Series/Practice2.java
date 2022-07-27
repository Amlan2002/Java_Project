package DP_Stirver_Series;

public class Practice2 {
    //backtracking example not use f(i-1,n) print n - 1
    public static void f(int i, int n){
        if(i>n){
            return;
        }
        f(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        f(0,5);
    }
    
}
