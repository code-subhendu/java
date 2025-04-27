class Cylinder
{
    private double radius;
    private double height;
       //seter
    // public void set_radius_height(double r,double h)
    // {
    //     radius=r;
    //     height=h;
    // }
       //gater
    // public int get_radius()
    // {
    //     return radius;
    // }
    // public int get_height()
    // {
    //     return height;
    // }
    public double surfaceArea()
    {
        double a=2*(22/7)*radius*(height+radius);
        return a;
    }
    public double Volume()
    {
        double b=(22/7)*radius*radius*height;
        return b;
    }
      //using constructor
    public Cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
}
public class Pr_01
{
    public static void main(String args[])
    {
        Cylinder c=new Cylinder(5,8);
        // c.set_radius_height(5,9);
        System.out.println(c.surfaceArea());
        System.out.println(c.Volume());
    }
}