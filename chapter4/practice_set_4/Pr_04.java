import java.util.Scanner;
class Pr_04
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("The day is monday");
                break;
            case 2:
                System.out.println("The day is tuisday");
                break;
            case 3:
                System.out.println("The day is wednesday");
                break;
            case 4:
                System.out.println("The day is thursday");
                break;
            case 5:
                System.out.println("The day is friday");
                break;
            case 6:
                System.out.println("The day is satarday");
                break;
            case 7:
                System.out.println("The day is saunday");
                break;
            default:
                System.out.println("You entered a wrong number");

        }
    }
}