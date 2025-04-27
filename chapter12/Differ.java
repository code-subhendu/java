import modifier.Access_modifier;
class Using extends Access_modifier
{
    void meth5()
    {
        System.out.println(p);   //can
        System.out.println(q);   //can
        // System.out.println(s);   //can't
        // System.out.println(t);   //can't
    }
}
public class Differ
{
    public static void main (String args[])
    {
        Access_modifier a=new Access_modifier();          // Diifer is the non-sub class
        // System.out.println(a.p);       //we can access
        // System.out.println(a.q);       //we can't access
        // System.out.println(a.s);       //we can't access
        // System.out.println(a.t);       //we can't access    //accessing private variable from same class
        
        Using u=new Using();         //Using is the sub class of Access_modifier class
        u.meth5();

    }
}