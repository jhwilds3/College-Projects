package assignment1;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * My words and actions will reflect Academic Integrity. I will not cheat or lie
 * or steal in academic matters. I will promote integrity in the UNCG community.
 * James Wilds III 08/11/2022
 */

// James WIlds III
// CSC 130, Sec #
// Assignment One

public class Assignment1 {

    public static void main(String[] args) {
        double length = 0.0;
        double width = 0.0;
        double perimeter = 0.0;
        double area = 0.0;
        double diagonal = 0.0;
        
        System.out.println("James Wilds III");
        System.out.println("CSC 130, Sec #");
        System.out.println("Assignment One\n");

        /* added the keyboard as input device */
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = keyboard.nextDouble();
        perimeter = 2 * (length + width);
        area = length * width;
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.println("\nThe perimeter is " + perimeter);
        System.out.println("The area is " + area);
        System.out.println("The diagonal is " + diagonal);
        

    }
    
}