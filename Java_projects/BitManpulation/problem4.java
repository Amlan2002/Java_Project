package Java_projects.BitManpulation;
//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number:");
        int binary = sc.nextInt();
        int decimal = BinaryToDecimal(binary);
        System.out.println("The binary number : " + binary + "And it's decimal is: " + decimal);
        System.out.println("The decimalto binary number : ");
        decimalToBinary(decimal);
        sc.close();
    }

    private static void decimalToBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;  
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();// new line
    }

    public static int BinaryToDecimal(int binary) {

        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
}
