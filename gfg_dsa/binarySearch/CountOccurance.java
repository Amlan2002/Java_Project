package gfg_dsa.binarySearch;

public class CountOccurance {
    public static void main(String[] args) {
        int arr[] = {10,20,20,20,20,40,50,50};
        int search = 20;
        int low = 0;
        int high = arr.length -1;
        int count = 0;
        //time complexity = O(logn + k)
        int fc = firstOccurance(arr,low,high,search); 
        if(fc == -1){
            System.out.println("0");
        } else{
        int lc = lastOccurance(arr,low,high,search);
        count = lc - fc + 1;
        System.out.println(count);
        }
    }

    private static int firstOccurance(int[] arr, int low, int high, int search) {
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < search){
                low  = mid + 1;
            }
            else if(arr[mid]>search){
                high = mid-1;
            } else {
                if(arr[mid] == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                } else {
                    high = mid -1;
                }
            }
        }
        
        return -1;
    }

    private static int lastOccurance(int[] arr, int low, int high, int search) {
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
