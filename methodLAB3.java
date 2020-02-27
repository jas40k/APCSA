import java.util.Scanner;
public class methodLAB3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String userName = input.nextLine();
      
      nameLine(userName);
      System.out.println("Goodbye, "+ userName);
   }
   
   public static void nameLine(String name)
   {
      int x=0;
      int y=1;
      
      for(int i = 0; i <  name.length(); i++ )
      {
         System.out.println(name.substring(x,y));
         x++;
         y++;
      }
   }
}