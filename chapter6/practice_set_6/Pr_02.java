import java.util.Scanner;
class Pr_02
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float arr[]={2.3f,3.4f,23.1f,2.7f,4.5f};
        System.out.print("Enter the element to chack: ");
        float a=sc.nextFloat();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(a==arr[i])
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("The element is present");
        }
        else
        {
            System.out.println("The element is not present");
        }
    }
}