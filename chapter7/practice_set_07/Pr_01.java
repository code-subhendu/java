class Pr_01
{
    static void multiplication (int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
    }
    public static void main(String args[])
    {
        multiplication(6);
    }
}