interface sampleInterface
{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface
{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface
{
    public void meth1()
    {
        System.out.println("Hi");
    }
    public void meth2()
    {
        System.out.println("Hello");
    }
    public void meth3()
    {
        System.out.println("love");
    }
    public void meth4()
    {
        System.out.println("You");
    }
}
class Inheritance_Interface
{
    public static void main(String args[])
    {
        MySampleClass my =new MySampleClass();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}