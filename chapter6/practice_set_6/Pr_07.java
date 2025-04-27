class Pr_07
{
    public static void main(String args[])
    {
        float arr[]={2.8f,3.4f,23.1f,2.7f,4.5f};
        float min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
        
    }
}