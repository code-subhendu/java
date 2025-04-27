// import java.lang.Math;
class Rectangle
{
    double length;
    double width;
    double perimeter()
    {
        return (2*(length+width));
    }
    double area()
    {
        return (length*width);
    }
}
class Pr_04
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.length=30;
        r.width=20;
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}