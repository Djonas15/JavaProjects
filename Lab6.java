/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 6 - Beer Run
*10/24/19
***************/

import java.util.Scanner; // imports scanner

public class Lab6
{


   public static void main(String[] args)
   { 
      Scanner a = new Scanner(System.in);
      
      final int MINAGE = 21;
      final double BEERPRICE = 5.00;
     
            
      System.out.print("Please type customer age: ");// prompt user to enter age
      int age = a.nextInt();
   
      System.out.print("Type customer cash amount: ");// prompt user to enter amount of money
      double price = a.nextDouble();
      
      //nested if statement
      if ( age < MINAGE )
      {
         System.out.println("No beer for you!");
         System.out.println("Please come back in " + (MINAGE-age) + " years.");
      }
      else
      {
         if ( price >= BEERPRICE )
         {
            System.out.println("Congratulations, you can have some beer");
         }
         else if (price < BEERPRICE)
         {
            System.out.println("No beer for you!");;
            System.out.println("Sorry you need $" +(BEERPRICE-price)+ " more.");
         }
      }
     
     System.out.println("Thank you for your patronage");   
   
   
   }
}