class Tommy
{
    void hit()
    {
        System.out.println("Hitting.. the enemy");
    }
    void run()
    {
        System.out.println("Running.. from the eneny");
    }
    void fire()
    {
        System.out.println("Firring.. on the enemy");
    }
}
class Pr_05
{
    public static void main(String args[])
    {
        Tommy t= new Tommy();
        t.run();
        t.hit();
        t.fire();
    }
}