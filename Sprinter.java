public class Sprinter
{
   private String name;
   private double time1;
   private double time2; 
   private double time3;
   
   public Sprinter(String localName, double t1, double t2, double t3)
   {
   name = localName;
   time1 = t1;
   time2 = t2;
   time3 = t3;
   }
   
   public String getName()
   {
      return name;
   }
   public double getTime1()
   {
      return time1;
   }
   public double getTime2()
   {
      return time2;
   }
   public double getTime3()
   {
      return time3;
   }
   
   public double getAverageTime()
   {
      return (time1+time2+time3)/3.0;
   }

}