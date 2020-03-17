public int[][] matrixAdd(int[][] a, int[][] b)
{
   int[][] c = new int[0][];
   if (a.length == 0 || b.length == 0)
       return c;
       
   c = new int[a.length][a[0].length];
   for (int i = 0; i < c.length; i++)
   {
       for (int j = 0; j < c[0].length; j++)
       {
           c[i][j] = a[i][j] + b[i][j];
       }
   }
    return c;
}
