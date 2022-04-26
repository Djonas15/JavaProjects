public class animalTest{
  public static void main (String[]args){
    animal creature1 = new animal();
    creature1.type = "lion";
    creature1.numlegs = 4;
    creature1.aniclass = "mammal";
    creature1.displayani();
    
    animal creature2 = new animal();
    creature2.type = "shark";
    creature2.numlegs = 0;
    creature2.aniclass = "fish";
    creature2.displayani();
    
    animal creature3 = new animal();
    creature3.type = "alligator";
    creature3.numlegs = 4;
    creature3.aniclass = "reptile";
    creature3.displayani();
   
  }
}