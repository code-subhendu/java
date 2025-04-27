class Method
{
    static void joke()
    {
        System.out.println("sun rises in the east\n \t we want to do a fist");
    } 
    static int logic (int x,int y)
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
        Method m=new Method();
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(c);
        int a1=3;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        joke();
    }
}