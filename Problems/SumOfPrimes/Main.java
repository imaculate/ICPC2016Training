//https://f0rth3r3c0rd.wordpress.com/2011/12/16/uva-1213-sum-of-different-primes-2/
import java.util.*;
public class Main{

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      //populate table first
      boolean[] isPrime = calculatePrimes(1120);
        // count primes
      int primes = 0;
      for (int i = 2; i <= 1120; i++) {
         if (isPrime[i]) primes++;
      }
        
      System.out.println(primes);
      int[] res = new int[primes];
      int j = 0;
      for (int i = 2; i <= 1120; i++) {
         if (isPrime[i]){
            res[j] = i;
            j++;
         }
            
      }
      int[][] table = new int[1121][15];
      /*for(int i = 0; i<= 1120;i++){
         if(isPrime[i]){
            table[i][0] = 1;
         }
      }*/
      table[0][0] = 1;
       for(int i=0;i<res.length;i++)
        for(j=1120;j>=res[i];j--)
            for(int k=1;k<15;k++)
               table[j][k]+=table[j-res[i]][k-1];
      /*for(int n = 1; n<=1120; n++){
         for(int k = 1; k<=14; k++){
            
           for(int i = 0; i< res.length; i++){
               if(n>=res[i]){
                  table[n][k] += table[n-res[i]][k-1];
                }
           }
         }
      }*/
      
      String next = scanner.nextLine();
      int N = 0; 
      int K = 0;
      while(!next.equals("0 0")){
         String[] arr = next.split(" ");
         N = Integer.parseInt(arr[0]);
         K = Integer.parseInt(arr[1]);
         //precalculate primes
         
         System.out.println(table[N][K]);
         next = scanner.nextLine();

        
      }
   }
   
   public static boolean[] calculatePrimes(int n){
      boolean[] isPrime = new boolean[n+1];
      for (int i = 2; i <= n; i++) {
         isPrime[i] = true;
      }
   
        // mark non-primes <= n using Sieve of Eratosthenes
      for (int factor = 2; factor*factor <= n; factor++) {
      
            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
         if (isPrime[factor]) {
            for (int j = factor; factor*j <= n; j++) {
               isPrime[factor*j] = false;
            }
         }
      }
   
      
      //System.out.println(res[0]);
      return isPrime;
   }
   
   

}