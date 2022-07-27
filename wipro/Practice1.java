package wipro;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        String str = "Fo+23the3*like2+";
        // String str = "we8+you2-7to/*32";
        // String str = "i*-t5s-t8h1e4birds";
        int rr = fixTheFormula(str);
        System.out.println(rr);
    }

    public static int fixTheFormula(String str) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                int k = Character.getNumericValue(ch);
                arr1.add(k);
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                arr2.add(ch);
            }
        }
        int res = calculate(arr1.get(0), arr1.get(1), arr2.get(0));
        for (int i = 2; i < arr1.size(); i++) {
            res = calculate(res, arr1.get(i), arr2.get(i - 1));
        }
        return res;
    }

    public static int calculate(int x, int y, int op) {
        int res = 0;
        if (op == '+') {
            res = x + y;
        }
        if (op == '-') {
            res = x - y;
        }
        if (op == '*') {
            res = x * y;
        }
        if (op == '/') {
            res = x / y;
        }
        return res;
    }

}
