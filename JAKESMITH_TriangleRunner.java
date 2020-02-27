/**
  * Program: TriangleRunner.java
  * Author: R. Gordon
  * Date: 12/1/19
  * Description: this program prints two triangles.
  * It uses the Triangle.java class definition file to create
  * triangle objects and its toString() method to build the string of
  * []s to print out.
  * The first triangle is smaller than the second triangle.
  */

import java.util.Scanner;
public class JAKESMITH_TriangleRunner
{
      public static void main(String[] args)
      {
         /* get two integer values from the user, 
            use the values to create 1 small and 1 large triangle. 
            Assume user input is error-free */
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your first integer value: ");
            int small = input.nextInt();
            System.out.print("Please enter your second integer value: ");
            int large = input.nextInt();
         
         
         
         
         /* Construct and print the small triangle (small) */
         JAKESMITH_Triangle smallTriangle = new JAKESMITH_Triangle(small);
         System.out.println(smallTriangle.toString());
         
         
         
         
         
         /* Construct and print the large triangle (large) */
         System.out.println("");
         JAKESMITH_Triangle largeTriangle = new JAKESMITH_Triangle(large);
         System.out.println(largeTriangle.toString());
         
         
         
         
         
         /* See me when you are done, so that I can review your work
            and grade it. */
            
         
         
         
         
         /* Extensions:
            1. Change your nested loops so that you print a square instead
               of a triangle.
            
            2. Modify your program to check that the value entered for the small
            triangle is less than the value entered for the large triangle.
            If not, print an error message and exit the program. 
          */
            
            
            
            
         
      }
      }