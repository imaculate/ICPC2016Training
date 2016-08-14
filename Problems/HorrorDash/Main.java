import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int T = k.nextInt();
      for(int i =0; i<T;i++){
         int N = k.nextInt();
         int maxSpeed = 0;
         for(int j = 0; j< N;j++){
            int t = k.nextInt();
            maxSpeed = (t>maxSpeed)?t:maxSpeed;
         }
         
         System.out.println("Case "+(i+1)+": "+maxSpeed);
         
      }
   }
}