import java.util.*;

public class test{


   public static void main(String[] args) {
           
      Scanner inp = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("32mb " + null +" 65twenty "+ null);
      
      System.out.println( rand.nextInt(500) );
      
      
      System.out.println( Math.random() );
      
      double i = 50.0;
      double j = 0.0;
      double k = (i/j);
      System.out.println(k); 
      
      
      System.out.print("Enter an integer: ");
      int q = GetAnInteger();
      System.out.println("You entered "+ q);
      
           
   }
   
   public static int GetAnInteger(){
      Scanner inp = new Scanner(System.in);
      while(true){
         try{
            return inp.nextInt();
         }
         catch(InputMismatchException e){
            inp.next();
            System.out.print("That is not an integer. Try again: ");
         }
      }
   }
   

}   
      