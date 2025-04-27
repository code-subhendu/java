import java.util.Scanner;
class Pr_03
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Income: ");
        int i=sc.nextInt();
        if(i<2.5)
        {
            System.out.print("You do not require to pay any tax");
        }
        if(i>=2.5 &&i<5)
        {
            double k=i-2.5;
            double p=k*5/100;
            System.out.print("Your paid tax is"+p);
        }
        if(i>=5 &&i<10)
        {
            double k=i-2.5;
            double r=i-5;
            double p=(k*5/100)+(r*20/100);
            System.out.print("Your paid tax is"+p);
        }
        if(i>=10)
        {
            double k=i-2.5;
            double r=i-5;
            double j=i-10;
            double p=(k*5/100)+(r*20/100)+(j*10/100);
            System.out.print("Your paid tax is"+p);
        }
    }
}