package wipro;
import java.util.*;
public class practice3 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int input1[] = new int[]
        // System.out.println(findRepArray())
        // sc.close();
    }
    public static int findRepArray(int[] input1,int input2){
    HashSet<Integer> set = new HashSet<Integer>();
		int ans = input1[0];
		for(int i= 0; i<input2;++i){
			if(input1[i]>0){
				if(set.contains(input1[i])){
					ans = input1[i];
					break;
				}
				set.add(input1[i]);
			}
		}
		if(set.size() == 0){
			ans = 0;
		}
		return ans;
	}
}
