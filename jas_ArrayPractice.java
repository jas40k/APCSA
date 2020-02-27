import java.util.Scanner;
public class jas_ArrayPractice
{
   public static void main(String[] args)
   {
         
      // instantiate an integer array named numbers
      // to hold 5 integers (populate it with your choice of integers)
      int[] numbers = {5,7,8,-9,-58};
      
      
      //Write methods to...
      // 1. print the integers in forwards order (from first to last)
      forwardOrder(numbers);
      // 2. print the integers in backwards order (from last to first) backwardOrder
      backwardOrder(numbers);
      // 3. print all odd integers printodds
      printOdds(numbers);
      // 4. print all even integers printeven
      printEvens(numbers);
      // 5. find and print the smallest integer in the array      smallest value
      smallestValue(numbers);
      // 6. find and print the largest integer in the array      largest values
      largestValue(numbers);
      // 7. find and print the mean, median, and mode of the numbers     print stats
      
      // 8. ascending order
      ascendingOrder(numbers);
      printStats(numbers);
      // 9. Change the input process to include a Scanner and let the user
      //    enter a list of numbers (use a sentinel to indicate when data entry is
      //    complete
   
   }
   
   public static void forwardOrder(int[] n)
   {
      System.out.print("Forwards order of array: ");
      for (int i = 0; i < n.length; i++)
      {
         System.out.print(n[i]+ " " );
      }
      System.out.println();
   }
   
   public static void backwardOrder(int[] n)
   {
      System.out.print("Backwards order of array: ");
      for (int i = n.length -1; i >= 0; i--)
      {
      System.out.print(n[i]+" ");
      }
      System.out.println();
   }
   
   public static void printOdds(int[] n)
   {
      System.out.print("Odd values of the array: ");
      for (int i = 0; i < n.length; i++)
      {
         if ((n[i]%2)!=0)
            System.out.print(n[i] + " ");
      }
      System.out.println();
   }
   
   public static void printEvens(int[] n)
   {
   System.out.print("Even values of the array: ");
      for (int i = 0; i < n.length; i++)
      {
         if ((n[i]%2)==0)
            System.out.print(n[i] + " ");
      }
      System.out.println();
   }
   
   public static void smallestValue(int[] n)
   {
      System.out.print("The smallest value of the given array is: ");
      int sValue = n[0];
      for (int i = 1; i < n.length; i++)
         {
            if (sValue > n[i])
            sValue = n[i];
         }
      System.out.println(sValue);
   }
   
   public static void largestValue(int[] n)
   {
      System.out.print("The largest value of the given array is: ");
      int lValue = n[0];
      for (int i = 1; i < n.length; i++)
         {
            if (lValue < n[i])
               lValue = n[i];
         }
      System.out.println(lValue);
   }
   
   public static void ascendingOrder(int[] n)
   {
      int temp = 0;
      System.out.print("The ascending order of the given array is: ");
      for (int j = 0; j < n.length; j++)
      {
         for (int i = j + 1; i < n.length; i++)
         {
            if (n[i]<n[j])  //if first value is greater than the second, switch them
            {
               temp = n[i];     //setting temp to original value at n[i] 
               n[i] = n[j];     //setting value at n[i] to n[i]
               n[j] = temp; 
            }
         }
         System.out.print(n[j] + " ");
      }
      System.out.println();
   }
   
   public static void printStats(int[] n)
   {
   double mean = 0;
   double median = 0;
   int mode = 0;
      for (int i = 0; i < n.length; i++)
      {
         mean += n[i];
      }
   mean /= 2;
   
      if ((n.length % 2) != 0)
      {  
         median = n[n.length/2];
      }
      else 
      {
         
         median = (double)(n[n.length/2] + n[n.length/2 + 1])/2;
      }
      
     
      System.out.println(mean);
      System.out.println(median);
   }
   public static modeArray(int[] n)
   {
      int mVal = 0;
      int mCount = 0;
         for(int i = 0; j < number.length; i++)
         {
            int count = 0;
            for (int j =0; j < numbers.length; j++)
            {
               if(numbers[j]==numbers[i])
                    count++;
            }
            if (count > mCount)
            {
               mCount = count;
               mVal = numbers[i];
            }
         }
            if(mCount>1)
              System.out.println("The mode is " + mVal);
            else if (mCount <=1)
                  System.out.println("There is no mode");
   }
}
