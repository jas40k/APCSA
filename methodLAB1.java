import java.util.Scanner;
public class methodLAB1
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
  
   System.out.print("Please enter your favorite number: ");
   int favNum = input.nextInt();
   String holder = input.nextLine();
   System.out.print("Please enter your favorite word: ");
   String favWord = input.nextLine();
   
   perLine(favNum, favWord);
   }
   
   public static void perLine(int x, String y)
   {
      int i;
      for (i = 0; i < x; i++)
      {
         System.out.print(y+" ");
      }
   }
}