package Java_projects.example;
import java.util.Arrays;

public class practiceQuestion2 {

   
    public static String stringConcatenation(String input1,String input2){
        String str = input1 + input2;
        String noSpaceStr = str.replaceAll("\\s", ""); 
        char[] s = noSpaceStr.toCharArray();
        descOrder(s);
        System.out.println(s);
        return str;
    }
    static void descOrder(char[] s)
    {
        Arrays.sort(s);
        reverse(s);

    }
 
    static void reverse(char[] a)
    {
        int i, n = a.length;
        char t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
       String result = removeDuplicate(a, a.length);
       
        
    }

    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
 
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
    // Driver code
    public static void main(String[] args) {
        stringConcatenation("hello","sodif");
        
    }

}
