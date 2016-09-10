import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int height= sc.nextInt();
      int cs = 1;
      do{
         ArrayList<Integer> list = new ArrayList<Integer>();
         
         
         while(height!=-1){
            list.add(height);
            height = sc.nextInt();
         }
         /*HashMap<>
         for(int i=0; i<list.size(); i++){
         }*/
         long[] table = new long[list.size()];
         
         long global_max = 0;
         for(int i = 0; i< list.size(); i++){
            int curr = list.get(i);
            long max = 0;
            for(int j = 0; j<i;j++){
               if(list.get(j)> curr){
                  max = Math.max(max, table[j]);
               }
            }
            table[i] = max+1;
            global_max = Math.max(table[i], global_max);
         }
         
         
         System.out.println("Test #"+cs+":\n  maximum possible interceptions: "+ global_max);
         System.out.println();
         
         height = sc.nextInt();
         cs+=1;
      }while(height!=-1);
   }
}