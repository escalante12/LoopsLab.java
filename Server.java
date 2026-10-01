
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server;

import java.util.Scanner;

/**
 *
 * @author Escalante_CPE113
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Activity 1: Multiplication Table Generator (for loop)
        try (Scanner scanner = new Scanner(System.in)) {
            // Activity 1: Multiplication Table Generator (for loop)
            System.out.println("=== Activity 1: Multiplication Table Generator ===");
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num1 + " x " + i + " = " + (num1 * i));
            }
            System.out.println();
            
            // Activity 2: Sum of Natural Numbers (while loop)
            System.out.println("=== Activity 2: Sum of Natural Numbers ===");
            System.out.print("Enter a number: ");
            int num2 = scanner.nextInt();
            int sum = 0;
            int count = 1;
            while (count <= num2) {
                sum += count;
                count++;
            }
            System.out.println("Sum = " + sum);
            System.out.println();
            
            // Activity 3: Factorial Calculator (do-while loop)
            System.out.println("=== Activity 3: Factorial Calculator ===");
            System.out.print("Enter a number: ");
            int num3 = scanner.nextInt();
            long factorial = 1;
            int j = 1;
            if (num3 > 0) {
                do {
                    factorial *= j;
                    j++;
                } while (j <= num3);
            }
            System.out.println("Factorial = " + factorial);
            System.out.println();
            
            // Activity 4: Even and Odd Numbers (for loop)
            System.out.println("=== Activity 4: Even and Odd Numbers ===");
            System.out.print("Enter a number: ");
            int num4 = scanner.nextInt();
            
            System.out.print("Even numbers: ");
            for (int i = 1; i <= num4; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            
            System.out.print("Odd numbers: ");
            for (int i = 1; i <= num4; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
            
            // Activity 5: Reverse Digits of a Number (while loop)
            System.out.println("=== Activity 5: Reverse Digits of a Number ===");
            System.out.print("Enter a number: ");
            int num5 = scanner.nextInt();
            int reversed = 0;
            int temp = num5;
            
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
            System.out.println("Reversed: " + reversed);
        }
    
    }
    
}
