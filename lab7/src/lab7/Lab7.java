package lab7;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity. I will not cheat or lie
 * or steal in academic matters. I will promote integrity in the UNCG community.
 * Christian Wilson and James Wilds 11/2/2022
 */

//  James Wilds
// CSC 130, Sec 3
// Lab Seven

public class Lab7 {
    
    static Scanner input = new Scanner(System.in);

    public static boolean isEven(int num1) {
        
        // the isEven() method returns true if the argument is even, or false otherwise
        if ((int) num1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int getRoll(int min, int max){
  
       return   (int)(Math.random() * (max - min) + 1);
    }
    
    public static void greetingLanguages(){
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("\nEnter your Language: ");
        String language = input.nextLine();
        
        
     switch (language){
         case "English": System.out.println("Hello, " + firstName);
         break;
         case "Russian": System.out.println("Ð¿Ñ€Ð¸Ð²ÐµÑ‚, "+ firstName);
         break;
         case "French": System.out.println("bonjour, "+ firstName);
         break;
         case "Chinese": System.out.println("ä½ å¥½, "+ firstName);
         break;
         case "Korean": System.out.println("ì•ˆë…•í•˜ì„¸ìš”, "+ firstName);
         break;
         case "Spanish": System.out.println("hola, "+ firstName);
         break;
         case "Thai": System.out.println("Swáº¡sdÄ«, "+ firstName);
         break;
         case "Cambodian": System.out.println("suostei, "+ firstName);
         break;
         
        
         
        
    }   
        
        
    }

    public static void main(String[] args) {
        
           
        System.out.print("This is the isEven method() that tests to see if a number is even or not\n"
                + "Enter an integer: ");
        int number = input.nextInt();
        input.nextLine();
        
        if(isEven(number) == true){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        int max = 6;
        int min = 1;
        
        System.out.println("\nThis is the getRoll() method that generates a random number between 1-6 and returns it.");
        System.out.println("The roll is " + getRoll(min,max));
        
        greetingLanguages();
        
        }
    }



