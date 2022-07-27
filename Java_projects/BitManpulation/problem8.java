package Java_projects.BitManpulation;

import java.util.Scanner;

public class problem8 {

    static int msbPos(int n)
    {
        int pos = 0;
        while (n != 0) {
            pos++;
            n = n >> 1;
        }
        return pos;
    }

    static int josephify(int n)
    {
        int position = msbPos(n);
        int j = 1 << (position - 1);
        n = n ^ j;
        n = n << 1;
        n = n | 1;
      
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The chosen place is "
                + josephify(n));
        sc.close();
    }
}
