import java.util.Scanner;
public class methodLAB2
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter your first integer: ");
   int num1 = input.nextInt();
   System.out.print("Please enter your second integer: ");
   int num2 = input.nextInt();
   
   addition(num1,num2);
   multiplication(num1,num2);
   
   }
   
   public static void addition(int x, int y)
   {
      int a1 = x + y;
      System.out.println("The sum of the integers entered is "+ a1);
   }
   public static void multiplication(int x, int y)
   {
      int a1 = x * y;
      System.out.println("The product of the integers entered is "+ a1);
   }
}