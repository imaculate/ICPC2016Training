import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int N = Integer.parseInt(k.nextLine());
      for(int i=0; i<N; i++){
         String line = k.nextLine();
         String[] arrs = line.split("|");
         for(int j= 0;j< arrs.length; j++){
            String s = arrs[j];
            s = s.replace("(", "").replace(")", "");
            System.out.println(s);
            String[] arr2 = s.split("&");
            HashMap<Character, Boolean> map  = new HashMap<Character, Boolean>();
            for(int m = 0; m<arr2.length; m++){
               String st = arr2[m];
               boolean n = false;
               char c = '';
               if(st.length>1){
                  c = st.charAt(i);
                  
               }else{
                  c = st.charAt(i);
                  n = true;
               }
               if(map.contains(c) && map.get(c)!= n)
            }
            
         }
      }
   }
   
   public static boolean opposites(String a, String b){
      if(a.length() ==2)
         return a.charAt(1) == b.charAt(0);
      else
        return a.charAt(0) == b.charAt(1);
   }
}