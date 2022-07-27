package Recursion;
public class PrintSubSeqSumIsKCount {
    public static int printS(int idx,int arr[],int sum,int k){
        if(idx == arr.length) {
            if(sum == k){
                return 1;
            }
         return 0;
        }
        // take the element 
        sum += arr[idx];
        int r = printS(idx+1,arr,sum,k);
        sum -= arr[idx];
 
        //for not take the element
        int s = printS(idx+1,arr,sum,k);

        return r+s;
     }
     public static void main(String[] args) {
         int arr[] = {1,2,1};
         int k = 2;
         int sum = 0;
         System.out.println(printS(0,arr,sum,k));
     }
}
