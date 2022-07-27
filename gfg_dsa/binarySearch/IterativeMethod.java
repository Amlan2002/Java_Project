package gfg_dsa.binarySearch;

public class IterativeMethod {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int search = 50;
        int low = 0;
        int high = arr.length -1;
    
        System.out.println(binarySearch(arr,low,high,search)); 
    }

    private static int binarySearch(int[] arr, int low, int high, int search) {
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid] == search){
                return mid;
            }
            else if(arr[mid] < search){
                low  = mid + 1;
            }
            else if(arr[mid]>search){
                high = mid-1;
            }
        }
        return -1;
    }
}
