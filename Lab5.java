/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab 5 - Magic Number
*10/9/19
***************/
import java.util.Scanner; // imports scanner

public class Lab5{


   public static void main(String[] args) {
        
      String fortune = ""; //shortcut 
      Scanner inp = new Scanner(System.in);             
      
      System.out.println("Please enter a number between 1 and 10"); // Prompts the user
      int num = inp.nextInt();
      double mgnum = 0; // variable for magic number
      
      // Magic number algortihms and fourtunes
      if (num == 1)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Aspire to inspire before we expire";
      }
      else if (num == 2)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Don't let yesterday take up too much of today";
      }      
      else if (num == 3)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "If there are 12 fish in a bowl and half of them drown and 3 others swim away how many are left?";
      }
      else if (num == 4)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "You've got Loyalty and royaltly inside your DNA";
      }
      else if (num == 5)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Don't let yesterday take up too much of today";
      }
      else if (num == 6)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "You've got Loyalty and royaltly inside your DNA";
      }
      else if (num == 7)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Aspire to inspire before we expire";
      }
      else if (num == 8)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Sit down, Be humble";
      }
      else if (num == 9)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Look what you made";
      }
      else if (num == 10)
      {
         mgnum = (num * 10 + 9) / 4 * 8;
         fortune = "Sit down, Be humble";
      }
      else //Precaution if someone doesnt input the proper number 
      {
         fortune = "Can not compute magic number. Please try again";
      }
   
      System.out.println("You entered: " + num);
      System.out.println("Your magic number is " + mgnum);
      System.out.println(fortune);
   }
   

}   
      