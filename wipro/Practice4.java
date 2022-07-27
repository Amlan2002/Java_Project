package wipro;
import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        int input1[] = {10,5,70,1};
        System.out.println(placeAlphabets(input1));
        
    }

    public static char[] placeAlphabets(int[] input1){
        char[] ans = new char[input1.length];
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<input1.length;i++){
            map.put(input1[i],i);
        }
        char c = 97;
        for(Map.Entry<Integer,Integer> m:map.entrySet()) {
            ans[m.getValue()] = (char)(c);
            c = (char)(((int)c)+1);
        }
        return ans;
    }
}
