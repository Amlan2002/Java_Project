package Java_projects.pattern;

import java.util.Scanner;

public class pattern_question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, val, col;
        for (row = 0; row < n; row += 2) {
            val = n * row + 1;
            for (col = 0; col < n; col++) {
                System.out.print(val++);
            }
            System.out.println();
        }
        for (row = n - 1; row >= 1; row--) {
            if (row % 2 == 1) {
                val = n * row + 1;
                for (col = 0; col < n; col++) {
                    System.out.print(val++);
                }
                System.out.println();
            }

        }
        sc.close();
    }
}
