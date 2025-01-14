//input a[0,1,...,(n-1)]
//output a[sorted]
import java.util.Scanner;

public class PsuedoSort2{

   public static void main(String[]args){
         
      Scanner inp = new Scanner(System.in);
      Scanner inp2 = new Scanner(System.in);
            
      int size = 1;
      char r = 'n';
      char j = 'y';
      char q = 'y';
      char c = 'y';
      
      while(r != 'y'){
      int a[] = new int[size];
      
         System.out.println("Enter the of numbers of the list:");           
         for(int m=0; m < size; m++){
         a[m] = inp.nextInt();
         }
         System.out.println("You have entered:");
         for(int v = 0; v < (a.length);v++){ //prints sorted array
         System.out.print(a[v] + " ");
      }
         System.out.println(" ");
         System.out.print("Is this correct(y/n):");
         j = inp2.next().charAt(0);
         if(j == 'y'){
            r = 'y';
         }
         else if(j == 'n'){
          System.out.print("Do you want to add more numbers(y/n):");
          q = inp2.next().charAt(0);
          if(q == 'y'){
            size++;
            r = 'n';
          }
          else{
            r = 'n';
          }
         }
      
      
      for(int i=0; i < (a.length-1); i++){
         if(a[i] > a[i+1]){
            int temp1 = a[i];
            a[i] = a[i+1];
            a[i+1] = temp1;
         }
         int t = i;
         while(t>0){          //correctly positions number
            if(a[t] < a[t-1]){
               int temp2 = a[t-1];
               a[t-1]=a[t];
               a[t]=temp2;
               t=t-1;
            }
            else{
               t=0;
            }
         }    
       }
       if(r == 'y'){
         System.out.println("The sorted list is:");
         for(int v = 0; v < (a.length);v++){ //prints sorted array
            System.out.print(a[v] + " ");
        }
       }
      }
   }
 
}