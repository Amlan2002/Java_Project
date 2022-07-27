package gfg_dsa.binarySearch;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {10,20,20,40,50,50};
        int search = 20;
        int low = 0;
        int high = arr.length -1;
    
        System.out.println(binarySearch(arr,low,high,search)); 
    }

    private static int binarySearch(int[] arr, int low, int high, int search) {
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < search){
                low  = mid + 1;
            }
            else if(arr[mid]>search){
                high = mid-1;
            } else {
                if(mid == arr.length - 1 || arr[mid+1] != arr[mid]){
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        
        return -1;
    }
}
