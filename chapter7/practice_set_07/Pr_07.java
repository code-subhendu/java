class Pr_07
{
    static void pattern(int n)
    {
        if(n>0)
        {
            for (int i=1;i<=n;i++)
            {
                System.out.print("*");
            }   
            System.out.print("\n");
            pattern(n-1);
        }
    }
    public static void main(String args[])
    {
        pattern(5);
    }
}