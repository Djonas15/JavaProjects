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
     
      // Rectangle     
      System.out.println("What is the Length of the Rectangle?"); 
      int len = type.nextInt();
      System.out.println("What is the Width of the Rectangle?"); 
      int wid = type.nextInt();
      int perrec = (2 * len)+(2 * wid); //Perimeter
      int arerec = (len * wid); //Area
      
      
      // Triangle
      System.out.println("What is the Base of the Triangle?");
      int bas = type.nextInt(); 
      System.out.println("What is the Height of the Triangle?");
      int hei = type.nextInt(); 
      int squa = 2;
      double aretri = (.5 * bas * hei);  //Area
      double pertri = ( bas + hei + Math.sqrt((Math.pow(bas, squa))+(Math.pow(hei, squa)))); //Perimeter
      
                      
      // Circle
      System.out.println("What is the Radius of the Circle?");
      int rad  = type.nextInt(); 
      double p = Math.PI;
      double percir = (2 * p * rad); //Perimeter
      double arecir = (p * Math.pow(rad, squa)); //Area
      
      //Prints outputs
      System.out.println("");
      
      System.out.println("-------------------------------------------------");
      
      System.out.println("The perimeter of the rectangle is: " + perrec);
      
      System.out.println("The area of the rectangle is: " + arerec);
      
      System.out.println("The perimeter of the triangle: " + pertri);
      
      System.out.println("The area of the triangle: " + aretri);
      
      System.out.println("The perimeter of the circle: "+ percir);
      
      System.out.println("The area of the circle: " + arecir);
      
      System.out.println("-------------------------------------------------");

            
   }
   

}   
    