package Java_projects.example;
import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//     q-1    Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
// q-2 Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
//q-3 Make a program that prints the table of a number that is input by the user. 
// (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)


        //Define variable
        // byte a = 10;
        // short b = 20;
        // int c = 30;
        // long d = 30;
        // float e = 30.4f;
        // double f = 14.55d;
        // char g = 'a';
        // boolean h = true;
        // String name = "Amlan";
        //constants
        final float PI = 3.14F;

        System.out.println("Enter the radius of circle:");
        float radius = sc.nextFloat();
        float area = PI*(radius * radius);
        System.out.println("Radius of circle is: "+radius+"\nThe circle area is: "+area);

        System.out.println("Now time for question 3");
        System.out.println("Enter the number to print the table");
        int n = sc.nextInt();
        System.out.println("The table for "+n);
        System.out.println(n+" * 1 = "+n*1);
        System.out.println(n+" * 2 = "+n*2);
        System.out.println(n+" * 3 = "+n*3);
        System.out.println(n+" * 4 = "+n*4);
        System.out.println(n+" * 5 = "+n*5);
        System.out.println(n+" * 6 = "+n*6);
        System.out.println(n+" * 7 = "+n*7);
        System.out.println(n+" * 8 = "+n*8);
        System.out.println(n+" * 9 = "+n*9);
        System.out.println(n+" * 10 = "+n*10);
        System.out.println("Thank you!, See you later");

       sc.close();

    }

}
