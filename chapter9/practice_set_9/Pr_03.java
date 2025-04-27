class Rectangle
{
    private double length;
    private double width;
    public double Area()
    {
        double a=length*width;
        return a;
    }
    public double Perimeter()
    {
        double b=2*(length+width);
        return b;
    }
      //using constructor
    public Rectangle(double l,double w)
    {
        length=l;
        width=w;
    }
}
public class Pr_03
{
    public static void main(String args[])
    {
        Rectangle c=new Rectangle(4,5);
        // c.set_radius_height(5,9);
        System.out.println(c.Area());
        System.out.println(c.Perimeter());
    }
}