/**
* TWIN PRIMES returns first 20 twin primes only odd #
*
* Jake Smith 1/29/20
* failed
*/
public class JakeS_TwinPrimes
{
   public static void main(String[] args)
   {
      int p1 = 0;             //variable declaration
      int p2 = 0;
      boolean prime;
      int track = 0;
      
      while (track != 20) // supposed to track how many times is printed
      {
         if (isOdd(p1) && isPrime(p1)) // determines is first parameter is odd and prime
         {
            
            p2 = p1+2;
            if(isOdd(p2) && isPrime(p2))     // determines if 2nd parameter is odd and prime
            {
            System.out.print(p1 + " " + p2);
            track++;
            }
         }
         p1=p2;
         p1++;
         
         
      }
      
   }
   
   public static boolean isPrime (int n)
   {
      if (n <= 1)
      return false;
      int m = 2;
      while (m * m <= n)
         {
            if (n % m == 0)
            return false;
            m++;
         }
      return true;
   }
   
   public static boolean isOdd (int n)
   {
      if (n%2==0)
         return false;
      else
         return true;
   }
}
