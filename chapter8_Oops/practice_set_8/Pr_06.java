// import java.lang.Math;
class Circle
{
    double radius;
    double perimeter()
    {
        return (2*(22.0/7.0)*radius);
    }
    double area()
    {
        return ((22.0/7.0)*radius*radius);
    }
}
class Pr_06
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.radius=12;
        System.out.println(c.perimeter());
        System.out.println(c.area());
    }
}