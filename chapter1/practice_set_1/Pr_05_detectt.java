import java.util.Scanner;
class Pr_05_detectt
{
    public static void main(String args[])
    {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        System.out.print(sc.hasNextInt());
    }
}