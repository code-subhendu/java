class Pr_06
{
    static int average(int ...arr)
    {
        int sum=0;
        for(int a :arr)
        {
            sum=sum+a;
        }
        int avg=sum/(arr.length);
        return avg;
    }
    public static void main(String args[])
    {
        System.out.println(average(2,3,4,5,6,7,8));
    }
}