import java.util.Scanner;
class Pr_02_cgpaa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Marks of math:");
        float m=sc.nextFloat();
        System.out.print("Enter the Marks of physics:");
        float p=sc.nextFloat();
        System.out.print("Enter the Marks of chemistry:");
        float c=sc.nextFloat();
        float d=(m+p+c)/30;
        System.out.print("cgpa value ="+d);

    }
}