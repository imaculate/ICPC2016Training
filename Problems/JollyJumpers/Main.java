import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      boolean jolly = true;
      String next = k.nextLine();
      while(!next.equals("")){
         //System.out.println(next);
         String[] nextArr = next.split(" ");
         int n = Integer.parseInt(nextArr[0]);
         boolean[] diffs = new boolean[n];
         int prev = Integer.parseInt(nextArr[1]);
         int curr = 0;
         for(int i = 2; i< n+1;i++){
            curr =  Integer.parseInt(nextArr[i]);
            curr = Math.abs(curr - prev);
            if(curr<n){
               diffs[curr] = true; 
            }
            else{
               System.out.println("Not jolly");
            
               jolly = false;
            }
                  
         }
         if(jolly){
               
            for(int i = 1;i<n; i++){
               if(!diffs[i]){
                  jolly = false;
                  System.out.println("Not jolly");
                  break;
               }
            
            }
         }
      
         if(jolly)
            System.out.println("Jolly");
         next = k.nextLine();
      }
   }
}