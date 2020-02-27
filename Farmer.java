public class Farmer
{
   private String name;
   private int acres;
   
   public Farmer(String localName, int n)
   {
      name = localName;
      acres = n;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getNumAcres()
   {
      return acres;
   }
}