import java.util.Scanner;
class Pr_03_name_greet
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String a=sc.nextLine();
        System.out.println("Hello "+a+" have a good day.");
    }
}