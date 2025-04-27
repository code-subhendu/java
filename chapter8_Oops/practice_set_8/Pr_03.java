import java.lang.Math;
class Square
{
    double side;
    double perimeter()
    {
        return (4*side);
    }
    double area()
    {
        return (Math.pow(side,2));
    }
}
class Pr_03
{
    public static void main(String args[])
    {
        Square s=new Square();
        s.side=10;
        System.out.println(s.perimeter());
        System.out.println(s.area());
    }
}