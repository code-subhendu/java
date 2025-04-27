import folder.folder1.folder2.Problemb3;
class G extends Problemb3
{
    void diij()
    {
        System.out.println(p);           //protected veriable can accessable by diff-pack sub-class
        // System.out.println(q);         //default variable ca't accessable by diff-pack sub-class
    }
}
class Pr_04
{
    public static void main(String args[])
    {
        System.out.println("I am main method!");
        G g=new G();
        g.diij();
    }
}