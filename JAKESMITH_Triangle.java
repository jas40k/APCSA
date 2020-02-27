/**
  * Triangle.java
  * Author: R. Gordon
  * Date: 12/1/19
  * Description: this is a class definition file.
  * This class describes triangle objects that can be displayed
  * as shapes like this:
  * []
  * [] [] 
  * [] [] [] 
  */


public class JAKESMITH_Triangle
{
  private int width;     //instance variable
   
 /**
      Constructs a triangle.
      @parm aWidth the number of [] in the last row of the triangle.
   */
   public JAKESMITH_Triangle(int aWidth)
   {
      width = aWidth;
   }
   
   
   
   /**
       Computes a string representing the triangle.
       @return a string consisting of [] and newline characters.
     */
   public String toString()
   {
      String r = "";          //Concatenate to this String and return
      
      
      /* your code goes here */
      /* use the user input to determine how many []s go in the last row */
      for (int i=1;i<=width;i++)
      {
         for(int j=1;j<=i;j++)
         {
               r+="[] ";
         }
         r += "\n";
      }

      return r;
   }

}