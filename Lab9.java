/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 9 - A Biography
*11/21/19
***************/
import java.util.Scanner;

public class Lab9
{


   public static void main(String[] args) 
   {
   
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Please enter your first and last name: "); //Prompts the user to enter their full name
      String a = inp.nextLine();
      
      int space = a.indexOf(' ');
      String asub = a.substring(++space);
      String apre = a.substring(0,--space);
      int aprelen = apre.length();
      int asublen = asub.length();
            
       
      System.out.print("Please enter your age: "); //Prompts the user to enter the age
      int b = inp.nextInt();
      
      
      System.out.print("Please enter your hometown: "); //Prompts the user to enter their hometown
      String d = inp.next();
      
      System.out.print("What school do you attend? "); //Prompts user to enter their school
      String e = inp.next();
      
      System.out.print("Please enter your major? "); //Prompts user to enter their major
      String f = inp.next();
      
      System.out.print("What genre of music do you listen to? "); //Prompts the user to enter the genre of music that they listen to
      String g = inp.next();
            
      System.out.print("Please enter a letter for your gender: "); //Prompts the user to enter there gender
      char c = inp.next().charAt(0);
      
      //Gives proper title depending on the gender that was inputed
      String title;
      if ( c == 'm')
      {
         title = "Mr ";
      }
      else if ( c== 'f')
      {
         title = "Ms ";
      }
      else 
      {
         title = "Mx ";
      }

      
      if(aprelen > asublen)
      {
         System.out.println(apre + " is longer than " + asub);
      }
      else if (aprelen < asublen)
      {
         System.out.println(asub + " is longer than " + apre);
      }
      else if (aprelen == asublen)
      {
         System.out.println(apre + " is the same length " + asub);
      }
     
            
      System.out.println(" ");
      System.out.println("*****************************");
      System.out.println("Here is the bio for " + a);
      System.out.println(" ");
      System.out.println(a + " is " + b + " and is from " + d + ".");
      System.out.println(title + a + " is currently majoring in " + f + " at " + e + ".");
      System.out.println(title + a +" enjoys listening to " + g + " during free time.");
      System.out.println("*****************************");
   
   }
}
