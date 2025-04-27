class Method_with_object
{
    int logic (int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String args[])
    {
        Method_with_object m=new Method_with_object();
        int a=5;
        int b=7;
        int c;
        c=m.logic(a,b);
        System.out.println(c);
        int a1=3;
        int b1=1;
        int c1;
        c1=m.logic(a1,b1);
        System.out.println(c1);

    }
}