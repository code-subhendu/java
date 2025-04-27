
import java.util.Scanner;
class Switch_case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        switch(age)
        {
            case 18:
                System.out.print("You are going to become adult");
                break;
            case 21:
                System.out.print("You are going to join job!");
                break;
            case 30:
                System.out.print("You are able to become a member");
                break;
            case 60:
                System.out.print("You are going to become old");
                break;
            default:
                System.out.print("Enjoy your life");

        }

    }
}