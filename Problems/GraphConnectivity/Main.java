import java.util.*;
public class Main{
   static class Graph{
      ArrayList<Character> points = new ArrayList<Character>();
   }
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int T = Integer.parseInt(k.nextLine());
      k.nextLine();
      for(int t = 0; t<T; t++){
         String line = k.nextLine();
         
         //int n = line.charAt(0)+ 1 - 'A';
         line = k.nextLine();
         ArrayList<Graph> graphs = new ArrayList<Graph>();
         while(!line.equals("")){
            char a  = line.charAt(0);
            char b = line.charAt(1);
            
            int A = -1;
            for(int  i = 0; i< graphs.size(); i++){
               Graph g = graphs.get(i);
               if(g.points.indexOf(a)>-1){
                  A = i;
                  break;
               }
                
            }
            int B = -1;
            for(int  i = 0; i< graphs.size(); i++){
               Graph g= graphs.get(i);
               if(g.points.indexOf(b)>-1){
                  B = i;
                  break;
               }
                
            }
         
            if(A>-1 && B==-1){
               graphs.get(A).points.add(b);
            }
            else if(A== -1 && B > -1){
               graphs.get(B).points.add(a);
            }
            else if(A== -1 && B==-1){
               Graph G = new Graph();
               G.points.add(a);
               G.points.add(b);
               graphs.add(G);
            }
            else if(A != B){
               //merge
               Graph ga = graphs.get(A);
               Graph gb = graphs.get(B);
               for(int i = 0; i< gb.points.size(); i++){
                  ga.points.add(gb.points.get(i));
                  
               }
               graphs.remove(B);
               
            }
            
            
            line = k.nextLine();
         }
         
         System.out.println(graphs.size());
         
          
      }
   }
}