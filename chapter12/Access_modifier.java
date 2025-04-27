package modifier;
class A
{
    public int x=5;
    protected int y=34;
    int z=7;
    private int r=56;
    public void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r);
    }
    protected void meth2()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r);
    }
    void meth3()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r);
    }
    private void meth4()
    {
        System.out.println(x);  
        System.out.println(y);  
        System.out.println(z);
        System.out.println(r);
    }
}
public class Access_modifier extends A
{
    public int p=31;
    protected int q=41;
    int s=51;
    private int t=61;
    public static void main(String args[])
    {
        A a=new A();
        // a.meth1();   //we can access
        // m.meth2();   //we can access
        // m.meth3();   //we can access
        // m.meth4();   //we can't access because accessing private method from sub class
        // System.out.println(a.x);       //we can access
        // System.out.println(a.y);       //we can access
        // System.out.println(a.z);       //we can access
        // System.out.println(a.r);       //we can't access because accessing private variable from sub class 
        Access_modifier m=new Access_modifier();
        // m.meth1();   //we can access
        // m.meth2();   //we can access
        // m.meth3();   //we can access
        // m.meth4();   //we can't access because accessing private method from sub class
        // System.out.println(m.x);       //we can access
        // System.out.println(m.y);       //we can access
        // System.out.println(m.z);       //we can access
        // System.out.println(m.r);       //we can't access because accessing private variable from sub class 
        System.out.println(m.p);       //we can access
        System.out.println(m.q);       //we can access
        System.out.println(m.s);       //we can access
        System.out.println(m.t);       //we can access    //accessing private variable from same class
    }
}