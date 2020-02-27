public class LightSequence
{
   String sequence;
   
   /** the parameter seq is the initual sequence used for the light display*/
   public LightSequence(String seq)
   {
      sequence = seq;
   }
   
   /* Inserts the string segment in the current sequence starting at the index ind.*/
   public String insertSegment(String segment, int ind)
   {
      String newSeq = "";
      newSeq = sequence.substring(0,ind);
      newSeq += segment;
      
      return newSeq;
   }
   
   public void display()
   {
      System.out.println(sequence);
   }
   
   public void changeSequence(String seq)
   {
      sequence = seq;
   }
   
   public String modifySequence(String segment)
   {
      String newSeq = "";
      int pos = sequence.indexOf(segment);
      newSeq = sequence.substring(0,position);
      newSeq+=sequence.substring(position + 2);
      
      return newSeq;
   }
}