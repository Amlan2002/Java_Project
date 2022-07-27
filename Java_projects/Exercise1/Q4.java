package Java_projects.Exercise1;

//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        float radius= sc.nextInt();
        circumference(radius);
        sc.close();
    }

    private static void circumference(Float radius) {
        float PI = 3.14f;
        System.out.println("The circumference of radius is: "+2* PI *radius);
    }

}
