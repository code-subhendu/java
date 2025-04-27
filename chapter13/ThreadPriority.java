class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);   // if i don't use this line in here then threas name will be like Thread-0 Thread-1 Thread-2
   }
    public void run()
    {
        int r=0;
        while (r<20){
            System.out.println("I am a thread "+this.getName());
            r++;
        }
    }
}
public class ThreadPriority{
    public static void main(String[] args) {
        Mythr1 t1=new Mythr1("Harry");
        Mythr1 t2=new Mythr1("csrry");
        Mythr1 t3=new Mythr1("boltu");
        Mythr1 t4=new Mythr1("maks");
        Mythr1 t5=new Mythr1("don");
        t5.setPriority(Thread.MAX_PRIORITY);           //setting t5 as my max priority
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}