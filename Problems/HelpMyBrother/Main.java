import java.util.*;
import java.math.*;
public class Main{
   public static void main(String[] args){
     Scanner k = new Scanner(System.in);
     int c = k.nextInt();
     ArrayList<Integer> list = new ArrayList<Integer>();
     int max = 0;
     while(c!=0){
         
         max = (c>max)?c:max;
         list.add(c);
         c = k.nextInt();
         
     }
     
     BigInteger[] fib = new BigInteger[max];
     if(max > 0)
      fib[0] = new BigInteger("0");
     if(max > 1)
      fib[1] = new BigInteger("1");
     if(max > 2)
      fib[2] = new BigInteger("2");
      
     for(int i = 3;i< max; i++){
      fib[i] = fib[i-1].add(fib[i-2]);
      //System.out.println(fib[i]);
     }
     
     BigInteger[] sm = new BigInteger[max+1];
     sm[0] = BigInteger.ZERO;
     for(int i=1;i<max;i++){
      sm[i] = sm[i-1].add(fib[i]);
      //System.out.println(sm[i]);
     }
     BigInteger two   = new BigInteger("2");
     
     for(int i= 0; i< list.size(); i++){
      
      int n = list.get(i);
      //System.out.println(n);
      
     
       
      BigInteger result =  (fib[n-1].divide(two)).add((fib[n-1].remainder(two).equals(BigInteger.ZERO))?BigInteger.ZERO:BigInteger.ONE);
      result = result.add((n>2)?sm[n-2]:BigInteger.ZERO);
      System.out.println("Set "+(i+1)+":");
      System.out.println(result);
     }
   }
}