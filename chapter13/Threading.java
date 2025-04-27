class A extends Thread
{
    // @override
    public void run()
    {
        int n=1;
        while(n<20){
            System.out.println("My thread is running");
            System.out.println("I am happy!");
            n++;
        }
    }
}
class B extends Thread
{
    // @override
    public void run()
    {
        int r=1;
        while(r<20){
            System.out.println("My thread2 is good");
            System.out.println("I am sad!");
            r++;
        }
    }
}
public class Threading
{
    public static void main(String args[])
    {
        A t1=new A();
        B t2=new B();
        t1.start();
        t2.start();    //here treades t1 and t2 will run concurrently 
                        // if we did't use threading in here then t1 run first and then t2 use to run
        
    }
}