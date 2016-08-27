import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      String[] mole = new String[4];
      String line = k.nextLine();
      int count = 0;
      while(!line.equals("Q")){
         mole[count%4] = k.nextLine()
         count++;
         if(count%4=0){
           int result = process(mole);
            
          }
         line = k.nextLine();
      }
      
   }
   
   public static int process(String[] molecule){
      for(int i = 0; i<4; i++){//different combinations
         
      }
   }
}