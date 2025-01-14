/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 10 - Review
*11/26/19
***************/
import java.util.Scanner;

public class ReviewLab{


   public static void main(String[] args) {
        
     
      int num1 = 4;
      int num2 = 6;
      
      //compares the 2 integers
      if(num1 > num2)
      {
         System.out.println(num1 +" is greater than "+ num2);
      }
      else if(num1 < num2)
      {
         System.out.println(num1 + " is less than " + num2);
      }
      else if(num1 == num2)
      {
         System.out.println(num1 + " is equal to " + num2);
      } 
      
      System.out.println(" ");
      
      for(int a = 1; a < 11; a++)
      {
        System.out.println(a); //prints 1-10
      }
      
      System.out.println(" ");
      
      String j = "Bring the beet in!";
      String k = j.substring(10,14); //stores "beet" in a substring
      System.out.println(k); //prints out substring
      
      System.out.println("");
      
      Scanner inp = new Scanner(System.in);
      System.out.print("Please enter a pharse: ");
      String p = inp.next();
      System.out.println("Your phrase length is " + p.length());
                  
   }
   

}   
      