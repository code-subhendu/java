import java.util.Scanner;
class Pr_02
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Math score:");
        int m=sc.nextInt();
        System.out.print("Enter your Physics score:");
        int p=sc.nextInt();
        System.out.print("Enter your Chemistry score:");
        int c=sc.nextInt();
        int t=(m+p+c)/3;
        if((m>=33 && p>=33 && c>=33) && t>=40)  
        {
            System.out.print("pass");
        }
        else
        {
            System.out.print("fail");

        }
    }
}