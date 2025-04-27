class Employee
{
    int id;
    String name;
    int salary;
    public void printdetails()
    {
        System.out.println("My id is: "+id); 
        System.out.println("My name is: "+name); 
        System.out.println("My salary is: "+salary); 
    }
    public int getSalary()
    {
        // System.out.println("My salary is :"+salary);
        return salary;
    }
}
class Custom_class
{
    public static void main(String args[])
    {
        System.out.println("This is a custom class");
        Employee harry=new Employee();        //object creation
        Employee john=new Employee();        //object creation
        harry.name="Subhendu Maiti";          //create an attribute
        harry.id=53;          //create an attribute
        harry.salary=50000;          //create an attribute
        john.name="Gragar johan Mendel";          //create an attribute
        john.id=54;          //create an attribute
        john.salary=30000;          //create an attribute
        // System.out.println(harry.id);      
        // System.out.println(harry.name);
        // System.out.println(harry.salary);
        // System.out.println(john.name);
        // System.out.println(john.id);
        // System.out.println(john.salary);
        harry.printdetails();
        john.printdetails();
        int johnsalary=john.getSalary();
        System.out.println(johnsalary);

    }
}