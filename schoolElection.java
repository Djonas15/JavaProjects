/*Title:School President
 *Description:Program collects the name of candidates, the number of votes and the winner of the election
 * Davon Jonas
 * 3/2/2020
 * */

import java.util.Scanner;
import java.util.Random;
public class schoolElection{
  public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    String[] names = new String[3];
    System.out.print("Please enter the first candidate's name: ");
      names[0]=inp.nextLine();
    System.out.print("Please enter the second candidate's name: ");
      names[1]=inp.nextLine();
    System.out.print("Please enter the third candidate's name: ");
      names[2]=inp.nextLine();
    
    int[] vote=new int[3]; 
    vote[0] = rand.nextInt(2000);
    vote[1] = rand.nextInt(2000);
    vote[2] = rand.nextInt(2000);
    System.out.println("Tallying votes...");
    System.out.println(names[0] + " has "+ vote[0]+ " votes");
    System.out.println(names[1] + " has "+ vote[1] + " votes");
    System.out.println(names[2] + " has "+ vote[2] + " votes");
    
    if(vote[0]> vote[1] && vote[0]>vote[2]){
      System.out.println("Congratulations School President "+names[0]+"!");
    }
    else if(vote[1]> vote[0] && vote[1]>vote[2]){
      System.out.println("Congratulations School President "+names[1]+"!");
    }
    else if(vote[2]> vote[0] && vote[2]>vote[1]){
      System.out.println("Congratulations School President "+names[2]+"!");
    }
  }
}