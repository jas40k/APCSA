public class jas_Medals
{
   public static void main(String[] args)
   {
   
   /* declare and initialize constants */
      final int COUNTRIES = 8;
      final int MEDALS = 3;
      
   /* declare and initialize a 1-D String array "countries" */
      String[] countries = 
         {
            "Canada",
            "Italy",
            "Germany",
            "Japan",
            "Kazakhstan",
            "Russia",
            "South Korea",
            "United States"
         };
         
      /* Declare and initialize 2-D String array "counts"            */
      /* Java stores a 2-D array as a 1-D array of rows              */
      /* counts[0] - refers to the first row                         */
      /* counts.length - refers to the number of rows                */
      /* counts[0].length - represents the number of columns         */
      /* ALT FORM: int[][] counts = new int[8][3]                    */
      
      int[][] counts = 
         {
            {0, 3, 0},
            {0, 0, 1},
            {0, 0, 1},
            {1, 0, 0},
            {0, 0, 1},
            {3, 1, 1},
            {0, 1, 0},
            {1, 0, 1}
         };
         
       System.out.println("         Country   Gold  Silver   Bronze   Total");
       
       //Print countries, counts, and row totals
       for(int i = 0; i < COUNTRIES; i++)
       {
         //Process the ith row
         System.out.printf("%15s", countries[i]);
         
         int total = 0;
         
         //Print each row element and update the row total
         for(int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            total = total + counts[i][j];
         }
         
         //Display the row total and print a new line
         System.out.printf("%8d\n", total);       
      }  
    
    // Caclulate and print column totals
      int totalG=0;
      
      for(int i = 0; i <counts.length;i++){
        totalG+=counts[i][0];
       }
      
      System.out.println("The total Gold is "+totalG);
      int totalS=0;
     
      for(int i = 0; i <counts.length;i++){
        totalS+=counts[i][1];
       
       }
      System.out.println("The total Silver is "+totalS);
      int totalB=0;
  
      for(int i = 0; i <counts.length;i++){
        totalB+=counts[i][2];
       
       }
      System.out.println("The total Bronze is "+totalB);
      int totalt = 0;
        for (int j = 0; j<counts.length;j++){
        for(int i = 0; i <counts[0].length;i++){
        totalt+=counts[j][i];
       }
       }
      System.out.println("The total is "+totalt);
    //print the array in reverse order
   for(int i = counts.length - 1; i >= 0; i--) 
      {
         int row = 0;
         int col = 0;
         
         for(int j = counts[0].length - 1; j >= 0; j--)

         {
            counts[row][col] = counts[i][j];
            
            row++;
             col++;
            
         }
        
          System.out.println();
       }


      
   }
}
