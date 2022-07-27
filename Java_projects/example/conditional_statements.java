package Java_projects.example;
import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {

        // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
        // follows :
        // 1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        // Calculate the result according to the operation given and display it to the
        // user.
        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        Scanner sc = new Scanner(System.in);

        // question no 1
        System.out.println("Welcome to Amlan's Calcuator.........");
        System.out.println("Enter the first no: ");
        int a = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();

        System.out.println(
                "which operation you wanna do: \n 1. Addition(+) \n 2. Subtraction(-) \n 3. Multiplication(*) \n 4. Division(/) \n 5. Modulo or remainder (%) \n Enter the operation number");
        // boolean c = true;
        // while (c == true) {
        int op = sc.nextInt();
        if (op == 1) {
            int Addition = a + b;
            System.out.println("After Addition: " + Addition);
        } else if (op == 2) {
            int Subtraction = a - b;
            System.out.println("After Subtraction: " + Subtraction);
        } else if (op == 3) {
            int Multiplication = a * b;
            System.out.println("After Multiplication: " + Multiplication);
        } else if (op == 4) {
            int Division = a / b;
            System.out.println("After Division: " + Division);
        } else if (op == 5) {
            int Modulo = a % b;
            System.out.println("After Modulo: " + Modulo);
        } else {
            System.out.println("Enter a vaild number (1-5)");
        }

        // System.out.println("Do you want to perform operation again y/n: ");
        // String d = sc.next();
        // if(d == "y") {
        // c = true;
        // continue;
        // } else {
        // c = false;
        // break;
        // }
        // }

        //Question number 2
        System.out.println("Welcome to questio number 2");
        System.out.println("Enter the number of month to display the name of that month: ");
        int month = sc.nextInt();

        switch(month) {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("Febuary");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("Noemember");
            break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Enter a vaild month");
            
        }

        System.out.println("Thank you! See you later");
        sc.close();
    }
}
