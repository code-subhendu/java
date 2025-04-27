class Multi2_dimentional_array
{
    public static void main(String args[])
    {
        int arr[][]=new int[2][3];
        arr[0][0]=34;
        arr[0][1]=31;
        arr[0][2]=12;
        arr[1][0]=32;
        arr[1][1]=82;
        arr[1][2]=42;
         //display
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        //----->same-->
        // for (int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.print("\n");
        // }
        
    }
}