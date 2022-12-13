
package assignment9;

import java.util.Scanner;
import java.util.Arrays;
public class Assignment9 {
   
public static Scanner input = new Scanner(System.in);
static int fullNumber;
static final int size = 16; 

static int myArray = 0;
//getWholeMethod
    public static int getWholeNumber(){
       
        System.out.print("Enter a whole number, one that does not have a decimal point: ");
         fullNumber = input.nextInt(); 
        
        return fullNumber;
    }
    
    //createArrayMethod
    
    public static int[] createArray(){
    
        
        int i= 0;
        int[] myArray = new int[size];
       
        for ( i = 0; i < myArray.length ; i++)
        {
          myArray[i] = getWholeNumber();
        
      
        }
        return myArray;
    }
    
    //printArrayMethod
    
    public static void printArray(int myArray[] ){
    System.out.println("The array is: \n " + Arrays.toString(myArray));
        System.out.println("");
    }
    
    //maximumElementMethod
    public static int maximumElement(int myArray[]){
        int max = myArray[0];
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("The maximum elemnt in the array is " + max);
        return max;
    }
    //sumArrayMethod
    public static int sumArray(int myArray[]){
        int sum = 0;
        for(int i=0; i < myArray.length; i++){
        sum += myArray[i];
        }
        return sum;
        
    }
    //meanArrayMethod
    public static double meanArrayz(double sum){
        
        double mean = sum / size;
        
        return mean;
        
    }
    

    public static void main(String[] args) {
        System.out.println("Assignment Nine\n" +
"James Wilds III\n" +
"CSC 130, Sec 3");
        
        System.out.println("\nThis program has 5 methods.\n" +
"The 1st method is called getWholeNumber().\n" +
" It gets a whole number from a user and returns that value.\n" +
"The 2nd method is called createArray().\n" +
" It creates an array of 16 integers & returns the array.\n" +
"The 3rd method is called printArray().\n" +
" It prints the array, using a for loop or a foreach loop to traverse the array\n" +
"The 4th method is called sumArray().\n" +
" It sums the elements in the array and returns that sum.\n" +
"The 5th method is called meanArray().\n" +
" It uses the sum to calculate the average and returns that average. ");
        
        
        System.out.println("\nYou will enter 16 whole numbers from 1-100\n" +
"Numbers can be repeated, and they do not need to be in order.\n");
    
    int ourArray[] = createArray();
    
    printArray(ourArray);
   
        System.out.println(" ");
        
maximumElement(ourArray); 
    
double sum = sumArray(ourArray);
        System.out.println("The elements in the array added together equal " + sum);
        
        System.out.println("The average of the elements in the array is " + meanArrayz(sum));
    
    }
    
}
