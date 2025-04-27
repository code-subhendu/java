class Pr_06
{
    public static void main(String args[])
    {
        float arr[]={2.3f,3.4f,23.1f,2.7f,4.5f};
        float max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        
    }
}