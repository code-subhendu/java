abstract class Pen 
{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen
{
    void write()
    {
        System.out.println("write");
    }
    void refill()
    {
        System.out.println("Refill");
    }
    void changeNib()
    {
        System.out.println("changing the nib");
    }
}
class Pr_01_02
{
    public static void main(String args[])
    {
        FountainPen f=new FountainPen();
        f.write();

    }
}