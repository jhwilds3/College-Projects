package lab10;

import java.util.Scanner;
import java.lang.Double;


// Lab Ten

/*
 James Wilds
 CSC 130, Sec 3
**/
public class Lab10 {

    static final int SIZE = 16;

    // method to print array using a for-each loop
    public static void printArray(double[] myArray) {

        for (double number : myArray) {
            System.out.printf("%,.2f ", number);
        }
        System.out.println();
    }
//printArray method
    public static void printArray(String[] wordArray) {

        for (String number : wordArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
//sortArray Method for myArray
    public static void sortArray(double[] myArray) {
        java.util.Arrays.sort(myArray);
    }
//sortArray Method for wordArray
    public static void sortArray(String[] wordArray) {
        java.util.Arrays.sort(wordArray);
    }
// searchArray method for myArray
    public static int searchArray(double[] myArray, double key) {
        int length = myArray.length;
        for (int i = 0; i < length; i++) {
            if (Double.compare(key, myArray[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
// searchArray method for wordArray
    public static int binarySearch(double[] myArray, double key) {
        return java.util.Arrays.binarySearch(myArray, key);
    }

    public static int binarySearch(String[] wordArray, String target) {
        int low = 0;
        int high = wordArray.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (0 > target.compareTo(wordArray[mid])) {
                high = mid - 1;
            } else if (0 == target.compareTo(wordArray[mid])) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lab Ten\n"
                + "Christian Wilson and James Wilds\n"
                + "CSC 130, Sec 3");

        System.out.println("This program has 7 methods.\n"
                + "This code is using a previously created method called printArray().\n"
                + "The program also has 6 additional methods.\n"
                + "The 1st new method is an overloaded method called printArray(). The method will print out the elements of\n"
                + "the string array.\n"
                + "The 2nd method is called sortArray(). It will use the sort() method from the Arrays class to sort the array of\n"
                + "numbers.\n"
                + "The 3rd method is an overloaded method called sortArray(). It will use the sort() method from the arrays\n"
                + "class to sort the array of strings.\n"
                + "The 4th method is called linearSearch(). It will search the array of numbers using a linear search algorithm.\n"
                + "It will return if the number is found or not.\n"
                + "The 5th method is called binarySearch(). It will use a binary search algorithm to search for a number entered\n"
                + "by the user. It will return if the number is found or not.\n"
                + "The 6th method is called binarySearchWords(). It will search the array of strings using a binary search\n"
                + "algorithm. It will return if the word is found or not.");

        double[] myArray = {1.9, 2.9, 3.4, 3.5, 5.5, 1.2, 2.4, 2.5, 3.6, 6.4, 9.8, 7.2, 6.7, 1.4, 5.6, 2.9};
        String[] wordArray = {"pear", "bannana", "strawberry", "melon", "cherry", "apple", "kiwi", "rassberry"};

        System.out.println("\nThe original array is:");
        printArray(myArray);

        System.out.println("\nThe sorted array is:");
        sortArray(myArray);
        printArray(myArray);

        System.out.print("\nWhat number would you like to search for? ");
        double key = input.nextDouble();

        int isFound = searchArray(myArray, key);
        if (isFound != -1) {
            System.out.println("The result from the linear search algorithm");
            System.out.println("The value " + key + " was found at the index of " + isFound);
        } 
        else {
            System.out.println("\nThe result from the linear search algorithm\n"
                    + "The element is not in the array.");
        }

        System.out.print("\nWhat number would you like to search for? ");
        key = input.nextDouble();

        int intResult = binarySearch(myArray, key);
        if (intResult > -1) {
            System.out.println("\nThe result from the binary search algorithm");
            System.out.println("The value " + key + " was found at the index of " + intResult);
        } 
        else {
            System.out.println("\nThe result from the binary search algorithm\n"
                    + "The element is not in the array.");
        }

        System.out.println("\nThe original array is:");
        printArray(wordArray);

        System.out.println("\nThe sorted array is:");
        sortArray(wordArray);
        printArray(wordArray);
        
        System.out.print("\nWhat fruit would you like to search for? ");
        String target = input.next();
        
        int index = binarySearch(wordArray, target);
        
        if (index > -1) {
            System.out.println("\nThe result from the binary search algorithm");
            System.out.println("The value " + target + " was found at the index of " + index);
        } 
        else {
            System.out.println("\nThe result from the binary search algorithm\n"
                    + "The element is not in the array.");
        }

    }

}

