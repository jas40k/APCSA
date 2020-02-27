public class jLightSequenceTester
{
   public static void main(String[] args)
   {
    LightSequence gradShow = new LightSequence("0101 0101 0101");  //a
    gradShow.display();    //b
    
    gradShow.changeSequence("0011 0011 0011");       //c 
    gradShow.display();
    
    String newGradShow = gradShow.insertSegment("1111",5);     //d
    System.out.print(newGradShow);
    
    
   }
}