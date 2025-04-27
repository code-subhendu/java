class Pr_04
{
    static void pattern()
    {
        for (int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        pattern();
    }
}