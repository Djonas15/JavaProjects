/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 5 - 
*10/8/19
***************/
import java.util.Scanner;

public class IffyGrade{


   public static void main(String[] args) {
        
      String lettgrade = "";
      Scanner num = new Scanner(System.in);             
      
      System.out.println("Please enter your grade out of 100");
      int grade = num.nextInt();
      
      if (grade >= 90)
      {
         lettgrade = "A";
      }
      else if (grade >= 85)
      {
         lettgrade = "B+";
      }      
      else if (grade >= 80)
      {
         lettgrade = "B";
      }
      else if (grade >= 75)
      {
         lettgrade = "C+";
      }
      else if (grade >= 70)
      {
         lettgrade = "C";
      }
      else if (grade >= 65)
      {
         lettgrade = "D+";
      }
      else if (grade >= 60)
      {
         lettgrade = "D";
      }
      else 
      {
         lettgrade = "F";
      }
   
      System.out.println("Your grade is " + lettgrade);
   }
   

}   
      