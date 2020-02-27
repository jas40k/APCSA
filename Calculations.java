/* 
Jake Smith
11/5/19
calculates numbers input by the user in a plethora of ways
*/
import java.util.Scanner;
public class Calculations
{
   public static void main(String[] args)
   {
      Scanner input1 = new Scanner(System.in);
      System.out.print("Please enter your first number: ");
      int num1 = input1.nextInt();
      System.out.print("Please enter your second integer: ");
      int num2 = input1.nextInt();
      
      int sum = addition(num1, num2);
      int dif = difference(num1,num2);
      int product = product(num1,num2);
      double avg = average(num1,num2);
      int dist = distance(num1,num2);
      int max = maximum(num1,num2);
      int min = minimum(num1,num2);
      int squareSum = squareSum(num1,num2);
      
      System.out.println("Your sum is "+ sum +".");
      System.out.println("Your difference is "+ dif +".");
      System.out.println("Your product is "+ product +".");
      System.out.println("Your average is "+ avg +".");
      System.out.println("Your distance is "+ dist +".");
      System.out.println("Your maximum is "+ max +".");
      System.out.println("Your minimum is "+min +".");
      System.out.println("Your sum of your numbers squared is "+squareSum+".");
      
   }

public static int addition(int x, int y)
{
      return x + y;
}
public static int difference(int x, int y)
{
      return x - y;
}
public static int product(int x, int y)
   {
      return x * y;
   }
public static double average(double x, double y)
   {
      double total = x + y;
      return total/2;
   }
public static int distance(int x, int y)
   {
      int dif = x-y;
      return Math.abs(dif);
   }
public static int maximum(int x ,int y)
   {
      return Math.max(x,y);
   }
public static int minimum(int x,int y)
   {
      return Math.min(x,y);
   }
public static int squareSum(int x,int y)
   {
      int x2 = x*x;
      int y2 = y*y;
      return x2+y2;
   }
}