class Employee
{
    private int salary;
    private String name;
    public Employee(){
        salary=10000;
        name="Ram";
    }
    public int getSalary()
    {
        return salary;
    }
}
public class QuickQuiz {
    public static void main(String args[])
    {
        Employee e=new Employee();
        System.out.println(e.getSalary());
    }
}
