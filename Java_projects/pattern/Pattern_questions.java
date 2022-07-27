package Java_projects.pattern;
public class Pattern_questions {
    public static void main(String[] args) {

        int n = 5;
        // Question 1

        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <= n; j++) {
        System.out.print("*");
        }
        System.out.println();
        }

        // Question 2
        System.out.println("The second pattern question");
        for (int i = 1; i<=n; i++) {
        for(int j=1;j <= (n-i);j++) {
        System.out.print(" ");
        }
        for(int j=1; j <=i; j++) {
        System.out.print(i+" ");
        }

        System.out.println();
        }

        // Question 3
        System.out.println("The third pattern question");
        for (int i = 1; i<=n; i++) {
        for(int j=1;j <= n-i;j++) {
        System.out.print(" ");
        }
        for(int j=i; j >=1; j--) {
        System.out.print(j);
        }

        for(int j=2;j<=i;j++) {
        System.out.print(j);
        }

        System.out.println();
        }

        // Question 4(hollow Butterfly)
        System.out.println("The fourth pattern question");

        // upper half
        for (int i = 1; i <= n; i++) {
        // for 1st part
        for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        // for spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
        }
        // for 2nd part
        for (int j = 1; j <= i; j++) {
        if (j == i || j == 1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }

        System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
        // for 1st part
        for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        // for spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
        }
        // for 2nd part
        for (int j = 1; j <= i; j++) {
        if (j == i || j == 1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }

        System.out.println();
        }

        // Question 5 ( hollow Rhombus)
        System.out.println("The five pattern question");
        for (int i = 1; i <= n; i++) {
        // spaces
        for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
        }
        // for stars
        for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }

        // Question 6 (pascal's Triangle)
        System.out.println("The six pattern question");
        for(int i =1;i<=n;i++) {
        //spaces
        for(int j=1;j <=n-i; j++){
        System.out.print(" ");
        }
        //number
        int num = 1;
        for(int j=0; j<=i; j++ ){
        System.out.print(num+" ");
        num = num * (i-j)/(j+1);
        }

        System.out.println();
        }

        // Question 7 (half pyramid)
        System.out.println("seven pattern question");
        for(int i =1;i<=n;i++) {
        //spaces
        for(int j=1;j <=n-i; j++){
        System.out.print(" ");
        }
        //number
        int num = 1;
        for(int j=1; j<=i; j++ ){
        System.out.print(num+" ");
        num++;
        }

        System.out.println();
        }

        // Question 8 (Inverted Half Pyramid)
        System.out.println(" eight pattern question");
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(n-i+1 + " ");
            }
            

            System.out.println();
        }
    }

}
