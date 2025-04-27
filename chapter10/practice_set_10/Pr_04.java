class Rectangle
{
    int b,w;
    void setBW(int b,int w)
    {
        this.b=b;
        this.w=w;
    }
    int getAreaRec()
    {
        return b*w;
    }
    int getPerimeterRec()
    {
        return (2*(b+w));
    }
}
class Cuboid extends Rectangle
{
    int b,w;
    int h;
    void setBWH(int b,int w,int h)
    {
        this.b=b;
        this.w=w;
        this.h=h;
        setBW(b,w);
    }
    int getAreaCub()
    {
        return 2*getAreaRec() + 2*(b*h) +2*(w*h);
    }
    int getVolumeCub()
    {
        return getAreaRec()*h;
    }
}
class Pr_04
{
    public static void main(String args[])
    {
        Cuboid c=new Cuboid();
        // c.setBW(3,4);
        // System.out.println(c.getAreaRec());
        c.setBWH(3,4,5);
        System.out.println(c.getAreaCub());
        System.out.println(c.getVolumeCub());
        // System.out.println(c.w);
        // System.out.println(Math.PI);
    }
}