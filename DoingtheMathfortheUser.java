/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 4 - Shape Calculation
*10/1/19
***************/

import java.util.Scanner; //imports Scanner program

public class Lab4
{


   public static void main(String[] args) 
   {
      Scanner type = new Scanner(System.in);
     
      System.out.print("What number you like to take the square root of? "); 
      
      int first = type.nextInt(); //  first input
      double root = Math.sqrt(first); // takes square root of first input
      
      System.out.println("1) the square root of " + first + " is " + root);
      
      System.out.println("Please enter 2 numbers to multiply:");
      
      int second = type.nextInt(); // second input
      int third = type.nextInt(); // third input
      int multi = (second * third); // multiplies second and third input     
      
      System.out.println("2) The product of " + second + " and " + third + " is " + multi);
      
      System.out.print("Please enter a number that you would like to be squarred:");
      
      int fourth = type.nextInt(); // fourth input
      int squar = 2;
      double squared = Math.pow(fourth, squar); // raises fourth input to the power of 2
      
      System.out.println("3) " + fourth + " squared is " + squared);
      
      System.out.print("Please enter a number to be raised to the 17th power: ");
      
      int fifth = type.nextInt(); // fifth input
      int powe = 17;
      double power = Math.pow(fifth, powe); // raises fifth input to the 17th power
      
      System.out.println("4) " + fifth + " is " + power);
            
   }
   

}   
      