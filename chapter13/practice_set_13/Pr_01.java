class Greet extends Thread{
    public void run(){
        while (true)
        {
            System.out.println("good morning..");
        }
    }
}
class Greet1 extends Thread{
    public void run(){
        while (true)
        {
            System.out.println("welcome..");
        }
    }
}
public class Pr_01 {
    public static void main(String[] args) {
        Greet t1 =new Greet();
        Greet1 t2 =new Greet1();
        t1.start();
        t2.start();
    }
}
