/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 10 - Methods
*11/27/19
***************/
import java.util.Scanner;

public class Lab10{


   public static void main(String[] args) {
        
     
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Please enter a number: ");
      double num1 = inp.nextDouble();
      
      System.out.print("Please enter a number: ");
      double num2 = inp.nextDouble();
      
      System.out.print("Please enter a number: ");
      double num3 = inp.nextDouble();
      
      System.out.print("Please enter a number: ");
      double num4 = inp.nextDouble();
      
      System.out.print("Please enter a number: ");
      double num5 = inp.nextDouble();
      
      System.out.println("You entered: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
      System.out.println("The average of the numbers entered is: " + averageOf(num1, num2, num3, num4, num5));
      System.out.println("The standard deviation of the numbers entered is: " + stanDevOf(num1, num2, num3, num4, num5));
            
   }
   
   public static double averageOf (double a, double b, double c, double d, double e){
      
      double avg = (a+b+c+d+e)/5; //formula for average
      return avg;
   }
   
   public static double stanDevOf (double a, double b, double c, double d, double e){
      
      double x = (a+b+c+d+e) / 5; // calcuate the average
      
      // varaibles to store diffference to square
      double asq = a-x;
      double bsq = b-x;
      double csq = c-x;
      double dsq = d-x;
      double esq = e-x;
      
      double inside = (Math.pow(asq,2) + Math.pow(bsq,2) + Math.pow(csq,2) + Math.pow(dsq,2) + Math.pow(esq,2)) / 5;
      double stadev = Math.sqrt(inside);
      return stadev; 
   }

}   
      