
public class jasArrayPractice2D
{
public static void main (String [] args)
{
   int [][] a1 = {{5,1}, {67,5729}};
   int [][] a2 = {{7,78}, {9,27}};

   //addition
   System.out.println("The sum of the two arrays is:");

   int[][] sum = new int[2][2];
        for(int i = 0; i < a1.length; i++) 
        {
            for (int j = 0; j < a1[0].length; j++) 
            {
                sum[i][j] = a1[i][j] + a2[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }   
      System.out.println();

     //subtraction
      System.out.println("The difference of the two arrays are:");
       int[][] dif = new int[2][2];
        for(int i = 0; i < a1.length; i++) 
        {
            for (int j = 0; j < a1[0].length; j++) 
            {
                dif[i][j] = a1[i][j] - a2[i][j];
                System.out.print(dif[i][j]+"  ");
            }
            System.out.println();
        }   
System.out.println();

//multiplication
   System.out.println("Multiplication is:");
   int [][] prod = new int[a1.length][a2.length];


       for (int i = 0; i < a1.length; i++) 
       { 
          for (int j = 0; j < a2[0].length; j++) 
        { 
              for (int k = 0; k < a1[0].length; k++)
            prod[i][j] += a1[i][k] * a2[k][j];
            
        }
        System.out.print(prod[i][j]+"  ");
       }
    System.out.println();
    }
  }
