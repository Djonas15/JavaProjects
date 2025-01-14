/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 7 - 
*10/31/19
***************/
import java.util.Scanner;

public class Lab7{


   public static void main(String[] args) {
        
      Scanner num = new Scanner(System.in);             
      
      // user import
      System.out.print("Please enter a starting number: "); //prompt user a number to start
      int start = num.nextInt();
      
      System.out.print("Please enter an ending number: "); //prompt user a number to end
      int end = num.nextInt();
      
      System.out.print("Please enter an increment number: "); //prompt user a number of an increment
      int incr = num.nextInt();
      
      while(start <= end)
      {
         if(start % 2 == 0)
         {
            System.out.println("The number " + start + " is even.");//prints if number is even
         }
         else  
         {
            System.out.println("The number " + start + " is odd.");//prints if number is odd
         }
         
         start += incr;
      }
      
      System.out.println("Thanks for playing! :)");
      
   }
   

}   
      