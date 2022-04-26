import java.util.Scanner;
public class bingo{
   public static void main(String[]args){
      int [][] card={{3,27,34,50,67},{6,19,35,48,65},{7,25,100,54,61},{13,26,36,55,64},{10,30,42,49,70}};
      int[] values = new int[5];
      Scanner input = new Scanner(System.in);
      for(int x=0;x < values.length;x++){
         System.out.println("Enter value");
         values[x] = input.nextInt();
         mark(card,values[x]); 
      }
      win(card);
   } 
 
   public static void mark(int[][] bcard,int num){
      for(int rows=0;rows < bcard.length;rows++){
         for(int cols=0;cols<bcard[rows].length;cols++){
            if(num == bcard[rows][cols]){
               bcard[rows][cols] = 100;
            }
         }
      }
   }
   public static void win(int[][] card2){
      for(int m=0;m < card2.length;m++){
         if(card2[0][m]==100){
            System.out.println("BINGO");
         }
      }
   }
   
}