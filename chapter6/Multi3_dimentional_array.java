import java.util.Scanner;
class Multi3_dimentional_array
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[][][]=new int[3][2][4];
        //input
        System.out.println("Enter the elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for (int k=0;k<4;k++)
                {
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        //print
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for (int k=0;k<4;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

    }
}