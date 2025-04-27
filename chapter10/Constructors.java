class Base
{
    Base()
    {
        System.out.println("I am a constructor");
    }
    Base(int a)
    {
        System.out.println("I am a overloaded constructor with value "+a);
    }
    public int x;
    public void setX(int x)
    {
        System.out.println("I am in base and setting x now");
        // x=x;
        this.x=x;
    }
    public int getX()
    {
        return x;
    }
    public void printMe()
    {
        System.out.println("I am a constructor");
    }
}
class Derived extends Base
{
    Derived()
    {
        // super(4);
        System.out.println("I am a deriver class constructor");
    }
    Derived(int x,int y)
    {
        super(x);
        System.out.println("I am a overloaded deriver class constructor"+y);
    }
    public int y;
    public void setY(int y)
    {
        // x=x;
        this.y=y;
    }
    public int getY()
    {
        return y;
    }
}
class ChildOfDerived extends Derived
{
    ChildOfDerived()
    {
        System.out.println("I am a child of derived class");
    }
    ChildOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am a overloaded child of derived class"+z);
    }
}
public class Constructors
{
    public static void main (String args[])
    {
        // Base b=new Base();
        // Derived d=new Derived();
        // Derived d=new Derived(4,5);
        ChildOfDerived eg =new ChildOfDerived(12,22,45);
        // d.setX(5);
        // System.out.println(d.getX());
        // b.setX(45);
        // System.out.println(b.getX());

        
    }
}