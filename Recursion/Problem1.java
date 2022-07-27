package Recursion;
public class Problem1 {
    public static int[] reverse(int arr[],int si,int ed){
        if(si >=ed) {
            return arr;
        }
        int temp = arr[ed];
        arr[ed] = arr[si];
        arr[si]  = temp;
        reverse(arr,si+1,ed-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res [] =reverse(arr,0,arr.length-1);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
