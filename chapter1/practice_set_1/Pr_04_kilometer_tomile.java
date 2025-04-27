import java.util.Scanner;
class Pr_04_kilometer_tomile
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length in Kilometer:");
        float a=sc.nextFloat();
        float b=a*0.621f;
        System.out.println(a+" kilometer= "+b+" mile");
    }
}