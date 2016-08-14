import java.util.*;
public class Main{
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int N = Integer.parseInt(k.nextLine());
      for(int i=0; i<N; i++){
         String line = k.nextLine();
         //System.out.println(line);
          boolean comps = false;
          //System.out.println(line.contains("|"));
         String[] arrs = line.split("\\|");
         

         for(int j= 0;j< arrs.length; j++){
            String s = arrs[j];
            //System.out.println(s);
            s = s.replace("(", "").replace(")", "");
            boolean prod = true;

            
            String[] arr2 = s.split("&");
            HashMap<Character, Boolean> map  = new HashMap<Character, Boolean>();
            for(int m = 0; m<arr2.length; m++){
               String st = arr2[m];
               //System.out.println(st);
               boolean n = false;
              char c = '0';
               if(st.length()>1){
                  c = st.charAt(1);
                  
               }else{
                  c = st.charAt(0);
                  n = true;
               }
               if(map.containsKey(c) && map.get(c)!= n){//found complements
                 
                  prod = false;
                  break;
               }else{
                  map.put(c,n);
               }
            }
            comps  = comps | prod;
           
             
         }
          if(comps)
               System.out.println("YES");
          else
              System.out.println("NO");
      }
   }
   

}