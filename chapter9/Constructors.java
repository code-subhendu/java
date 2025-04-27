class MyMainEmployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

            //constructor..

    // public MyMainEmployee() {
    //     id = 53;
    //     name = "Subhendu";
    // }
      
        //also we can pass an argument in it ..

    // public MyMainEmployee(String n,int i) {
    //     id = i;
    //     name =n;
    // }

        // also we can do costructor over loading also...
    
    public MyMainEmployee() {
        id = 53;
        name = "Subhendu";
    }
    public MyMainEmployee(String n,int i) {
        id = i;
        name =n;
    }
    public MyMainEmployee(String n) {
        id = 59;
        name =n;
    }

}

public class Constructors {
    public static void main(String[] args) {
        // MyMainEmployee harry = new MyMainEmployee();
        // MyMainEmployee harry = new MyMainEmployee("Kadir",54);
        MyMainEmployee harry = new MyMainEmployee("Kadir");
        // harry.setName("CodeWithHarry");
        // harry.getName();
        // harry.setId(53);
        // harry.getId();
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
