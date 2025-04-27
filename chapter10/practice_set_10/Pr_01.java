class Circle 
{
    double areaCir(int r)
    {
        double pi=22.0/7.0;
        double a=pi*r*r;
        return a;
    }
    double perimeterCir(int r)
    {
        double pi=22.0/7.0;
        double p=2*pi*r;
        return p;
    }
}
class Cyllinder extends Circle
{
    double areaCyl(int r,int h)
    {
        return (perimeterCir(r)*(h+r));
    }
    double volumeCyl(int r,int h)
    {
        return areaCir(r)*h;
    }
}
class Pr_01
{
    public static void main(String args[])
    {
        Cyllinder c= new Cyllinder();
        
        System.out.println(c.areaCyl(3,6));
        System.out.println(c.volumeCyl(3,4));
        // System.out.println(c.areaCir(3));
    }
}