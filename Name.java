public class Name
{
   private String fname;
   private String lname;
   private String mInitial;
   
   public Name(String n1,String n2, String mi)
   {
      fname=n1;
      lname=n2;
      mInitial = m1;
   }
   
   public String getNormalOrder()
   {
      return fname + " " + mInitial + ". " + lname;
   }
   
   public String getReverseOrder()
   {
      return lname + ", "+ fname +" " + mInitial + ".";
   }
   
   public void setFirstName(String n)
   {
      fname = n;
   }
   
   public void setMiddleInitial(String mi)
   {
      mInitial = mi;
   }
   
   public void setLastName(String n2)
   {
      lname = n2;
   }
   
   public String toString()
   {
      return getNormalOrder();
   }
}