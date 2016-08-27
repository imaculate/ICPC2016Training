import java.util.*;

public class Main{

   static class Point{
      
      int val;
      ArrayList<Integer> neighbors;
      
      public Point(int val){
         
         this.val = val;
         neighbors = new ArrayList<Integer>();
      }
      
   }
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int T = k.nextInt();
      for(int t = 0; t<T; t++){
         int n = k.nextInt();
         int m = k.nextInt();
         ArrayList<Point> list = new ArrayList<Point>();
         for(int i = 0; i<n; i++){
            int v = k.nextInt();
            Point p = new Point(v);
            list.add(p);
         }
         
         for(int i = 0; i< m;i++){
            int p1 = k.nextInt();
            int p2 = k.nextInt();
            
            Point start = list.get(p1);
            start.neighbors.add(p2);
         }
         
         long count = 0;
         Point curr = list.get(0);
         int max = -1;
         int maxi = -1;
         while(curr.neighbors.size()!=0){
            max = -1;
            maxi = -1;
            for(int j = 0; j< curr.neighbors.size(); j++){
               int nb = curr.neighbors.get(j);
               if(list.get(nb).val> max){
                  max = list.get(nb).val;
                  maxi = nb;
               }
               
            }
            count += max;
            curr = list.get(maxi);
           
         }
         
         System.out.println("Case "+(t+1)+ ": "+ count+ " "+ maxi);
         
         
         
      }
       
   }
}