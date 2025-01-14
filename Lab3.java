/***************
*Name: Davon Jonas
*206 LabSection#1
*Lab3 - Averages
*9/19/19
***************/

public class Lab3{


   public static void main(String[] args) {
      
   
      double  tes1 = 86; // 86 is assigned to tes1(Test 1)
      double  tes2 = 98; // 98 is assigned to tes2(Test 2)
      double  fintes = 93; // 93 is assigned to fintes(Final Test)
      double  labs = 90; // 90 is assigned to labs(Lab Average)
      double  hwqui = 90; // 90 is assigned to hwqui(HW/Quiz Average)
      double  fingra = ( (tes1 * .20) + (tes2 * .20) + (fintes * .20) + (labs * .30) + (hwqui * .10)); // Stores the final grade 
      
      System.out.println("****************************");
      System.out.println("Grade for Test 1 : " + tes1); 
      System.out.println("Grade for Test 2 : " + tes2);
      System.out.println("Grade for Final Exam : " + fintes);
      System.out.println("Lab Average : " + labs);
      System.out.println("HW/Quiz Average" + hwqui);
      System.out.println("****************************");
      System.out.println("Final Grade for this Class : " + fingra);
      
      
   }

   
}     