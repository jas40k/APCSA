int[][] jagged = new int[5][];
int lOff = 0;
for (int i = 0; i < 5; i++)
{

    jagged[i]=new int[i+1];
    for (int j = 0; j < jagged[i].length; j++)
    {
        lOff++;
        jagged[i][j] = lOff;
    }
        
}
//JAKE SMITH
