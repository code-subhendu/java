class Pr_08
{
    static void pattern(int n)
    {
        if(n>0)
        {
            pattern(n-1);
            for (int i=1;i<=n;i++)
            {
                System.out.print("*");
            }   
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        pattern(5);
    }
}