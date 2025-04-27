class Employee
{
    int salary;
    int getSalary()
    {
        return salary;
    }
    String name;
    String getName()
    {
        return name;
    }
    void setName(String n)
    {
        name=n;
    }
}
class Pr_01
{
    public static void main(String args[])
    {
        Employee harry=new Employee();
        Employee mohan=new Employee();
        harry.salary=3300;
        mohan.salary=4500;
        harry.name="Harry Ganguli";
        System.out.println(harry.getName());
        System.out.println(mohan.getSalary());
        mohan.setName("Mohan Nondi");
        System.out.println(mohan.name);


    }

}