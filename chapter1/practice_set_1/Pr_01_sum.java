import java.util.Scanner;
class Pr_01_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter Second number:");
        int b=sc.nextInt();
        System.out.print("Enter Third number:");
        int c=sc.nextInt();
        int d=a+b+c;
        System.out.println(d);
    }
}