import java.util.Scanner;
public class MethodWKST3
{
   public static void main(String[] args)
   {
   
      Scanner reply = new Scanner(System.in);
      System.out.println("What is your mid-year average in Java Programming?");
      double answer = reply.nextDouble();
   
      if (answer >= 65){
         Passing();
      }
      else if (answer < 65){
         notPassing();
      }
   }
   public static void Passing()
   {
      System.out.println("You are passing Java Programming.");
   }
   public static void notPassing()
   {
      System.out.println("Hook up with a smart classmate and STUDY!");
   }
}