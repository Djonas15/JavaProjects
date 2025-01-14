/**********************************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 3 - Printing Practice
*9/17/19
***********************************/

public class PrintingPractice{


   public static void main(String[] args) {
   
      int x = 3;  //3 is assigned to x
      int y = 15; //15 is assigned to y
      double product = (y ^ 2); // x times y is assigned to product
      double quotient = (product/(2*x));
      double remain = (product % (2*x));
      char first ='D';
      char last ='J';
     
      System.out.println("The answer for " + x + " * " + y + " is " + product);
      System.out.println("The answer for " + product + " / " + (2*x) + " is " + quotient);
      System.out.println("The answer for " + product + " % " + (2*x) + " is " + remain);
      System.out.println("My name is " + first + "avon" + " " + last +"onas");
      
   }
   

}   
      