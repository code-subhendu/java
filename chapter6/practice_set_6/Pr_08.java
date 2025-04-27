class Pr_08
{
    public static void main(String args[])
    {
        float arr[]={2.8f,3.4f,23.1f,24.7f,45.5f};
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp=1;
            }
        }
        if(temp==0)
        {
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
        
    }
}