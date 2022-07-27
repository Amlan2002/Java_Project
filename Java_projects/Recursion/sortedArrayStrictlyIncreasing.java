package Java_projects.Recursion;
//check if an array is sorted(Strictly Incresing )
//time complexity O(n)
public class sortedArrayStrictlyIncreasing {

    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        } else {
            return false;
        }
    }
   public static void main(String[] args) {
       int arr[] = {1,2,3,4,4};
       if(isSorted(arr, 0)) {
           System.out.println("The array is sorted");
       } else {
           System.out.println("The array is not sorted");
       }
   } 
}
