import java.util.Scanner;
class Pr_02_user_input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a =sc.nextInt();
        System.out.print("Enter 2nd number: ");
        float b=sc.nextFloat();
        System.out.println("the value of the addition is= "+(a+b));
        
        // String s=sc.next();
        // System.out.println(s);

        // System.out.print("Enter a number: ");
        // boolean b1 =sc.hasNextInt();         // chack it is integer or not if integer then return true else return false
        // System.out.print(b1);
    }
}