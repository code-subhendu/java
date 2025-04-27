class A implements Runnable {
    public void run() {
        int n = 1;
        while (n < 40) {
            System.out.println("I am a thread1 not a threat");
            n++;
        }
    }
}

class B implements Runnable {
    public void run() {
        int r = 1;
        while (r < 40) {
            System.out.println("I am a thread2 not a threat");
            r++;
        }
    }
}

public class Coderunnable {
    public static void main(String[] args) {
        A Bullet1 = new A();
        Thread gun1 = new Thread(Bullet1);

        B Bullet2 = new B();
        Thread gun2 = new Thread(Bullet2);
        gun1.start();
        gun2.start();
    }
}