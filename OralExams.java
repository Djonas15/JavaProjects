public class OralExams{
   public static void main(String[]args){
      //helworl
      for(int i=0;i<6;i++){
         System.out.print("HelloWorld");
         if(i<5){
           System.out.print("-"); 
         }
      }
      //simplsum
      System.out.println();
      System.out.println();
      int[] arr ={7,90,18,95,100,43};
      int sum=0;
      for(int j=0; j< arr.length-1;j++){
         sum +=j;
      }
      System.out.println(sum);
      //digital difference
      System.out.println();
      int[][] digdiff={{ 90,7,8 },{ 9,19,11 },{ 12,13,45 }};
      int sum1= digdiff[0][0]+digdiff[1][1]+digdiff[2][2];
      int sum2= digdiff[0][2]+digdiff[1][1]+digdiff[2][0];
      int diff=sum1-sum2;
      System.out.println(Math.abs(diff));
   }
} 