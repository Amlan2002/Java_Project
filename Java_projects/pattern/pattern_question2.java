package Java_projects.pattern;

import java.util.Scanner;

// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

public class pattern_question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, left, col,right;
        for (row = n; row >= 1; row--) {
            for (left = n; left>row; left--) {
                System.out.print(left);
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row);
            }
            for (right = row+1; right<=n; right++) {
                System.out.print(right);
            }
            System.out.println();
        }
        for (row = 2; row <= n; row++) {
            for (left = n; left>row; left--) {
                System.out.print(left);
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row);
            }
            for (right = row+1; right<=n; right++) {
                System.out.print(right);
            }
            System.out.println();
        }

    }
}
