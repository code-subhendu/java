import java.util.Scanner;
class Pr_03
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your name:");
        String a=sc.nextLine();
        String letter="Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>",a));
    }
}