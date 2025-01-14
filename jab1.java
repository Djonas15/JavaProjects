public class jab1{
  
  public static void main(String[] args){
    multiConcat("Claflin", 17);
  }
    
    
    public static String multiConcat(String a, int n){ 
       for(int i=0 ; i<n ; i++){
        System.out.print(a); 
      }
      return a; 
    }
    
}