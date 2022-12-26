package lab9;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity. I will not cheat or lie
 * or steal in academic matters. I will promote integrity in the UNCG community.
 * Christian Wilson and James Wilds 11/16/2022
 */
// James Wilds III
// CSC 130, Sec 3
// Lab Nine
public class Lab9 {

    static int SIZE = 7;
// method to print array using a for-each loop

    public static void printArray(double[] myArray) {
        for (double x : myArray) {
            System.out.printf("%.2f ", x);
        }
    }
// method to find the maximum value in the array

    public static double maxArray(double[] myArray) {
        double max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }
// method to generate random numbers to fill the array with new numbers

    public static void changeNumbers(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random() * 50;
        }
    }
// method to shift elements to the left
// the first element will become the last element

    public static void shiftArrayLeft(double[] myArray) {
        double temp = myArray[0]; // Retain the first element

        // Shift elements left
        for (int i = 1; i < myArray.length; i++) {
            myArray[i - 1] = myArray[i];
        }

        // Move the first element to fill in the last position
        myArray[myArray.length - 1] = temp;
    }
    //bonus - copy the elements from the myArray into the new array called myNewArray
// This method uses the arraycopy() method from the Arrays class

    public static void copyArray(double[] myNewArray, double[] myArray) {

        for (int i = 0; i < myArray.length; ++i) {
            myNewArray[i] = myArray[i];
        }

    }

    public static void main(String[] args) {
        System.out.println("Lab Nine\n"
                + "James Wilds III and Christian Wilson\n"
                + "CSC 130, Sec #3");

        System.out.println("\nThis program has 4 methods");
        System.out.println("The 1st method is called printArray(). Using a for-each loop, the method will print out the elements of the\n"
                + "array.\n"
                + "The 2nd method is called changeNumbers(). It generates random numbers from 0-50 & fills the array\n"
                + "with those new numbers.\n"
                + "The 3rd method is called maxArray(). It will find and return the maximum value in the array.\n"
                + "The 4th method is called shiftArrayLeft(). It will shift the elements to the left & make the first element\n"
                + "become the last element.");

        //create & initialize the array
        double[] myArray = {1.9, 2.9, 3.4, 3.5, 5.5, 1.2, 2.4};
        double[] myNewArray = new double[SIZE];

        // print the original array
        System.out.print("\nThe original array is: \n");
        printArray(myArray);

        //change the elements in the array using random & print the new array]
        System.out.println("\n\nThe changed array is:");
        changeNumbers(myArray);
        printArray(myArray);

        // call the maxArray method and print the max
        System.out.printf("\n\nThe maximum element in the array is %.2f\n", maxArray(myArray));

        // shift the elements to the left & make the 1st element becomes the last element
        System.out.println("\nThe array with the elements shifted to the left is:");
        shiftArrayLeft(myArray);
        printArray(myArray);
        //bonus - call the copyArray method and print it
        System.out.println("\n\nThe new array called myNewArray with the elements copied from the myArray array is:");
        copyArray(myNewArray, myArray);

        printArray(myArray);

    }

}
