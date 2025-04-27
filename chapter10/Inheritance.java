class Base
{
    int x;
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
    int y;
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
public class Inheritance
{
    public static void main (String args[])
    {
        Base b=new Base();
        Derived d=new Derived();
        d.setX(5);
        System.out.println(d.getX());
        b.setX(45);
        System.out.println(b.getX());
        
    }
}