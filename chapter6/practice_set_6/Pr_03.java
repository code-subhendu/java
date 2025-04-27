class Pr_03
{
    public static void main(String args[])
    {
        float arr[]={67f,34f,92f,82f,45f};
        float sum=0f;
        for(float element:arr)
        {
            sum=sum+element;
        }
        System.out.println("average ="+(sum/5));
    }
}