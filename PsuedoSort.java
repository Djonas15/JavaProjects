//input a[0,1,...,(n-1)]
//output a[sorted]

import java.util.Scanner;

public class PsuedoSort{

   public static void main(String[]args){
         
      Scanner inp = new Scanner(System.in);


      
      int size = 0;
      System.out.print("Enter the amount of numbers in the list:");
      size = inp.nextInt();
      
      System.out.println("Enter the of numbers of the list:");           
      int a[] = new int[size];
      for(int m=0; m < size; m++){
         a[m] = inp.nextInt();
      }
      
      for(int i=0; i < (a.length-1); i++){
         if(a[i] > a[i+1]){
            int temp1 = a[i];
            a[i] = a[i+1];
            a[i+1] = temp1;
         }
         int j = i;
         while(j>0){          //correctly positions number
            if(a[j] < a[j-1]){
               int temp2 = a[j-1];
               a[j-1]=a[j];
               a[j]=temp2;
               j=j-1;
            }
            else{
               j=0;
            }
         }    
       }
      for(int v = 0; v < (a.length);v++){ //prints sorted array
         System.out.print(a[v] + " ");
      }
   }
}