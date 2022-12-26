package lab3 ;
import java.util.Scanner;  
/**
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * James Wilds III      9/19/2022
 */
//James Wilds III
//CSC 130, Sec#3
//Assignment 2
public class Lab3 {
    
    public static void main(String[] args) {
     
   
  
   // declare variables
   
   
   
   
   
   
   
   
   System.out.println( "James Wilds III.");
   System.out.println( "CSC 130, Sec #3");
   System.out.println( "Assignment 2\n");
   
   System.out.println( "This progam will show a menu that allows him to have");
   System.out.println( "the program calculate the sum, subtraction, multiplication, and divion od two numbers.");

   System.out.println( "\n");
   
   int number1 ;
   int number2 ;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter the first number: ");
    number1 = input.nextInt();
    
   System.out.print(" Enter the Second number: ");
    number2 = input.nextInt();
    
    
    System.out.println( "*************************************************");
    
    System.out.println( "           Menu          ");
    System.out.println( "   1 - Calculate the sum of the two numbers ");
    System.out.println( "   2 - Calculate the subtraction of number 2 from number 1");

    System.out.println( "   3 - Calculate the multiplication of the two numbers");
    System.out.println( "   4 - Calculate the division of number 1 divided by number 2 ");

    System.out.println( "   5 - Quit ");
    
    System.out.println( "*************************************************");
    System.out.println( "\n");
    System.out.print("Please make your choice from the menu; ");
    int choice = input.nextInt();
    
            
    if(choice < 1 || choice > 5)
            {
               System.out.print( "Invalid choice. Please select 1, 2, 3, 4, or 5: ");

               choice = input.nextInt();
              
            }    
    else if (choice == 1) {
            
               
                int sumNumbers = number1 + number2;
                System.out.println("The Sum of " + number1 + "+" + number2 + " = " 
+sumNumbers);
            }
    else if (choice == 2){
               
                int subtractNumbers = number1 - number2;
                System.out.println("The Subtraction of " + number1 + "-" + number2 
+ "=" +subtractNumbers);
            }
    else if (choice == 3){
    
               
                int multiplyNumbers = number1 * number2;
                System.out.println("The Multiplication of " + number1 + "*" + 
number2 + " =" +multiplyNumbers);
            }
     else if (choice == 4)
     {
              
                double divideNumbers = (double)number1 / (double)number2;
                System.out.println("The Division of " + number1 + "*" + number2 + 
"=" + divideNumbers);
            }
else{
System.out.print( "Thank you for using my program\n");
        }
        
    
}
}