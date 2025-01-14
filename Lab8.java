/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 8 - I <3 Coffee
*11/14/19
***************/
import java.util.Scanner;

public class Lab8
{


   public static void main(String[] args) 
   {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Welcome to my Coffe Machine");
        System.out.println("What type of Coffe would you like?"); 
        System.out.print("Enter 1 for dark roast, 2 light roast, or 3 for decaff: ");//prompt user
        int coffee = inp.nextInt();
        String choice1 = "";
        
        switch(coffee)
        {
            case 1:
               choice1 = "dark roast";
               break;
            case 2:
               choice1 = "light roast";
               break;
            case 3:
               choice1 = "decaff";
               break;
            default:
               choice1 = "Sorry cannot understand. Please try again"; // case for unexecepted number
        } 
        
        System.out.println(" ");
        
        System.out.println("What flavor would you like?");// ask user for flaver
        System.out.print("Enter 1 for mocha, 2 for caramel, or 3 for none: "); //prompt user
        int flav = inp.nextInt();
        String choice2 = "";
        
        switch(flav)
        {
            case 1:
               choice2 = "mocha";
               break;
            case 2:
               choice2 = "caramel";
               break;
            case 3:
               choice2 = "none";
               break;
            default:
               choice2 = "Sorry cannot understand. PLease try again"; // case fo unexcepted number
        }
        System.out.println(" ");
        System.out.println("Here is your " + choice1 + " with " + choice2 + ".");
        System.out.println("Come again soon!");
            
   }
   

}   
      