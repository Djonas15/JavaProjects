/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 7 - 
*10/29/19
***************/

public class Nestedwhiles
{


   public static void main(String[] args) 
   {
        int count = 1; // variable to control loop
        int count2 = 1; // variable to control second loop
        int redloop = 3;//amount of red
        int bluloop = 2;//amount of blue
        
        //nested while
        while(count <= redloop)//first condition
        {
             System.out.println("red");
             count++;// increases count
 
            while(count2 <= bluloop)//second condition
            {
              
               System.out.println("--blue");
               count2++;// increases count2
         
            }
            //resets count2 to 0
            count2--;
            count2--;
        }
         
   }
   

}   
      