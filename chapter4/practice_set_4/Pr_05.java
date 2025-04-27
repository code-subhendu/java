import java.util.Scanner;
class Pr_05
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int y=sc.nextInt();
        if (y%100==0)
        {
            if(y%400==0)
            {
                System.out.print("the year is leap year");
            }
            else
            {
                System.out.print("the year is not a leap year");
            }
        }
        else
        {
            if(y%4==0)
            {
                System.out.print("the year is leap year");
            }
            else
            {
                System.out.print("the year is not a leap year");
            }
        }
    }
}