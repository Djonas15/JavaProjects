/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 9 - Calculator
*11/19/19
***************/
import java.util.Scanner;

public class Calculator{


   public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);  
      System.out.print("Please enter a number: ");
      int num1 = input.nextInt();
      
      System.out.print("Please enter another number: ");
      int num2 = input.nextInt();
      
      int sum = add(num1 , num2);
      
      int diff = minus(num1 , num2);
      
      int prod = multiply(num1 , num2);
      
      double quo = divide(num1 , num2);
      
      System.out.println("The sum of " + num1 + " and "+ num2+ " is " + sum);
      
      System.out.println("The difference of " + num1 + " and " + num2 + " is " + diff);
      
      System.out.println("The product of " + num1 + " and " + num2 + " is "+ prod);
      
      System.out.println("The quotient of " + num1 + " and " + num2  + " is " + quo);
            
   }
   public static int add (int x , int y){
      int sum = x + y;
      return sum;
   }
   
   public static int minus (int x , int y){
      int diff = x - y;
      return diff;
   }
   
   public static int multiply (int x , int y){
      int prod = x * y;
      return prod;
   }
   
   public static double divide (int x , int y){
      double quo = 0;
      if ( y == 0)
      {
         System.out.println("Error");
      }
      else
      {
         quo = x/y;
      }
      return quo;
   } 

}   
