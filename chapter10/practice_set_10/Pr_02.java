class Rectangle
{
    int areaRec(int b,int w)
    {
        return b*w;
    }
    int perimeterRec(int b,int w)
    {
        return (2*(b+w));
    }
}
class Cuboid extends Rectangle
{
    int areaCub(int b,int w,int h)
    {
        return 2*areaRec(b,w) + 2*(b*h) +2*(w*h);
    }
    int volumeCub(int b,int w,int h)
    {
        return areaRec(b,w)*h;
    }
}
class Pr_02
{
    public static void main(String args[])
    {
        Cuboid c=new Cuboid();
        System.out.println(c.areaCub(3,4,5));
        System.out.println(c.volumeCub(3,4,5));
    }
}