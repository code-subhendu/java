import java.util.Scanner;
class Pr_06
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your website name: ");
        String website=sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("Organization website");
        }
        if(website.endsWith(".com"))
        {
            System.out.println("Commersial website");
        }
        if(website.endsWith(".in"))
        {
            System.out.println("Indian website");
        }
    }
}