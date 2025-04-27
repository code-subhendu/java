class Sphare
{
    private double radius;
       //seter
    // public void set_radius(double r)
    // {
    //     radius=r;
    //     height=h;
    // }
       //gater
    // public int get_radius()
    // {
    //     return radius;
    // }
    
    public double surfaceArea()
    {
        double a=4*(22/7)*radius*radius;
        return a;
    }
    public double Volume()
    {
        double b=(4/3)*(22/7)*radius*radius*radius;
        return b;
    }
      //using constructor
    public Sphare(double r)
    {
        radius=r;
    }
}
public class Pr_05
{
    public static void main(String args[])
    {
        Sphare c=new Sphare(5);
        // c.set_radius_height(5,9);
        System.out.println(c.surfaceArea());
        System.out.println(c.Volume());
    }
}