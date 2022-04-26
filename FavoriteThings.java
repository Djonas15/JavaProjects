/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab Activity 8 - Favorite Things 
*11/12/19
***************/
import java.util.Scanner;

public class FavoriteThings{


   public static void main(String[] args) {
        
      String faveThings = "Raindrops on roses";
      char ch;
      int len;
      int pos;
      
      // String Methods
      System.out.println(faveThings);
      ch = faveThings.charAt(0);
      System.out.println("1: " + ch);
      len = faveThings.length();
      System.out.println("2: " + len);
      pos = faveThings.indexOf('p');
      System.out.println("3: " + pos);
      pos = faveThings.indexOf("roses");
      System.out.println("4: " + pos);
      System.out.println("5: " + faveThings.substring(13));
      System.out.println("6: " + faveThings.substring(0,10));
      System.out.println("7: " + faveThings.toUpperCase());
      System.out.println("8: " + faveThings.replace('a' , '@'));
      System.out.println("9: " + faveThings.startsWith("Raindrops"));
      System.out.println("10: " + faveThings + " and whiskers on kitens");
            
   }
   

}   
      