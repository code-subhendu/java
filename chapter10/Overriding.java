class A{
    public int harry(){
        return 4;
    }
    public void math2(){
        System.out.println("I am Subhendu Maiti");
    }

}
class B extends A{
    public void math2(){
        System.out.println("I am Subhendu");
    }
    public void math3(){
        System.out.println("I am harry");
    }
}
class Overriding
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        a.math2();
        b.math2();
    }
}