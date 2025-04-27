class Greet extends Thread{
    public void run(){
        int i=0;
        while (i<40)
        {
            System.out.println("good morning..");
            i++;
        }
    }
}
class Greet1 extends Thread{
    public void run(){
        int j=0;
        while (j<40)
        {
            System.out.println("welcome..");
            j++;
        }
    }
}
public class Pr_04 {
    public static void main(String[] args) {
        Greet t1 =new Greet();
        Greet1 t2 =new Greet1();
        // t1.setPriority(6);
        // t2.setPriority(9);
        System.out.println(t1.getPriority());  //if we don't set priority then it would be normal priority that is 5
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
