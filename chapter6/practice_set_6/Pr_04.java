import java.util.Scanner;
class Pr_04
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[][]=new int[2][3];
        int fly[][]=new int[2][3];
        System.out.println("Enter first matrix elements: ");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements: ");
        for(int i=0;i<fly.length;i++)
        {
            for (int j=0;j<fly[i].length;j++)
            {
                fly[i][j]=sc.nextInt();
            }
        }
        System.out.println("the sum matrix is: ");
        for(int i=0;i<fly.length;i++)
        {
            for (int j=0;j<fly[i].length;j++)
            {
                System.out.print((arr[i][j] + fly[i][j])+" ");;
            }
            System.out.print("\n");
        }

        
    }
}