class For_loop
{
    public static void main(String args[])
    {
        int n=10;
        for (int i=0;i<=n;i++)
        {
            // if(i%2 !=0)
            //     System.out.println(i);
            if(i==5)
                continue;
            System.out.println(2*i+1);
            if(i==6)
                break;
        }
    }
}