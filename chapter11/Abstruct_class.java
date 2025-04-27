abstract class Base
{
    public Base(){
        System.out.println("I am the constructor of Base class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
abstract class  Derived
{
    public void greet()
    {
        System.out.println("Good morning!");
    }
    public void greet2()
    {
        System.out.println("Good afternoon!");
    }
}
class Derived1 extends Base
{
    public void th(){
        System.out.println("I am good");
    }
    public void greet()
    {
        System.out.println("Good morning! bro");
    }
    public void greet2()
    {
        System.out.println("Good afternoon! bro");
    }
}
class Abstruct_class 
{
    public static void main(String args[])
    {
        // Base b=new Base();  //gives error because we can't create object of an abstruct class
        Derived d=new Derived();
        Derived1 d1=new Derived1();
        d1.greet();
        d.greet();
    }
}