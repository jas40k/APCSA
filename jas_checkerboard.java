import java.util.*;
public class jas_checkerboard
{
   public static void main(String[] args)
   {
   int[][] board = new int[8][8];
   
   for(int i =0; i<board[0].length;i++)
   {
      for (int j = 0; j < board.length; j++)
      {
      if ((i+j)%2 == 0)
      {
         board[i][j] = 0;
         System.out.print(board[i][j]+" ");
      }
      else
      {
         board[i][j] = 1;
         System.out.print(board[i][j]+" ");
      }
      }
      System.out.println();
   }
      
      
         }
}