class MyEmployee
{
    private int id;
    private String name;
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
}
public class Access_modifier 
{
    public static void main(String[] args) 
    {
        MyEmployee harry=new MyEmployee();
        //harry.id=45;    //throws an error due to private access modifier
        // harry.name="Harry Ganguli";      //throws an error due to private access modifier
        harry.setName("codeWithHarry");
        harry.setId(53);
        System.out.println( harry.getName());
        System.out.println( harry.getId());
    }
}