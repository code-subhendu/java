class MyNewthr1 extends Thread {
    public MyNewthr1(String name) {
        super(name); // if i don't use this line in here then threads name will be like Thread-0
                     // Thread-1 Thread-2
    }

    public void run() {
        int r = 0;
        while (r < 20) {
            System.out.println("I am a thread " + this.getName());
            try {
                Thread.sleep(489);       //method to interrupt
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r++;
        }
    }
}

class MyNewthr2 extends Thread {
    public MyNewthr2(String name) {
        super(name); // if i don't use this line in here then threas name will be like Thread-0
                     // Thread-1 Thread-2
    }

    public void run() {
        int r = 0;
        while (r < 20) {
            System.out.println("I am a thread" + this.getName());
            r++;
        }
    }
}

public class Thread_methods2 {
    public static void main(String[] args) {
        MyNewthr1 t1 = new MyNewthr1("Harry");
        MyNewthr2 t2 = new MyNewthr2("MOdannnn");
        t1.start();
        t1.join(); // if we use it without using try catch then it gives error: unreported
                   // exception InterruptedException; must be caught or declared to be thrown

        try{
            t1.join();
        }
        catch(Exception e)               //means--->first try to join if not joining then catch and join
        {
            System.out.println(e);
        }

        t2.start();
    }
}
