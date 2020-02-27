/*
Jake Smith
11/5/19
Latern Program
*/
public class Lanterns
{
   public static void main(String[] args)
   {
    Top();
    System.out.println("");
    Top();
    window();
    line();
    Top();
    System.out.println("");
    Top();
    miniLine();
    window();
    window();
    miniLine();
    miniLine();
   }
   public static void Top()
   {
      System.out.println("    *****");
      System.out.println("  *********");
      System.out.println("*************");
   } 
   public static void window()
   {
   System.out.println("* | | | | | *");
   }
   public static void line()
   {
   System.out.println("*************");
   }
   public static void miniLine()
   {
   System.out.println("    *****");
   }
}