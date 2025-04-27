package abc.p.p1;
class Girl
{
	public void sub()
	{
		System.out.println("we are substracting..");
	}
}
public class B extends Girl
{
    public void mul()
    {
        System.out.print("We are multiplying..");
    }
    public static void main(String args[])
    {
        Girl g=new Girl();
        g.sub();
        B b=new B();
        b.mul();
        b.sub();
    }
}