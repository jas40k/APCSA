import java.util.Scanner;
public class WeeklyPay
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the amount of regular hours worked: ");
   double regHour = input.nextDouble();
   System.out.print("Please enter the amount of overtime hours worked: ");
   double overtime = input.nextDouble();
   System.out.print("Please enter the hourly pay: ");
   double pay = input.nextDouble();
   
   double initialPay = pay*regHour;
   double overtime2 = overtime *1.5;
   double overtimePay = overtime2*pay;
   double totalPay = overtimePay+initialPay;
   
   System.out.print("Your total weekly pay is "+totalPay);
   }
   
}