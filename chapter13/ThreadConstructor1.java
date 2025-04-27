class Mythr extends Thread{
    public Mythr(String name){
        super(name);   // if i don't use this line in here then threas name will be like Thread-0 Thread-1 Thread-2
   }
    public void run()
    {
        int r=0;
        while (r<20){
            System.out.println("I am a thread");
            r++;
        }
    }
}
public class ThreadConstructor1 {
    public static void main(String[] args) {
        Mythr t=new Mythr("Harry");
        Mythr t2=new Mythr("Ram");
        t.start();
        t2.start();
        System.out.println("The id of the thread is " + t.getId());
        System.out.println("The name of the thread is " + t.getName());
        System.out.println("The id of the thread is " + t2.getId());
        System.out.println("The name of the thread is " + t2.getName());
    }
}
