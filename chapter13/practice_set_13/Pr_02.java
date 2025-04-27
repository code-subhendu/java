class Greet extends Thread{
    public void run(){
        while (true)
        {
            // try {
            //     Thread.sleep(200);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
            System.out.println("good morning..");
        }
    }
}
class Greet1 extends Thread{
    public void run(){
        while (true)
        {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome..");
        }
    }
}
public class Pr_02 {
    public static void main(String[] args) {
        Greet t1 =new Greet();
        Greet1 t2 =new Greet1();
        t1.start();
        t2.start();
    }
}
