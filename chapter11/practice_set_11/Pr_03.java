class Monkey
{
    void jump()
    {
        System.out.println("jumping..");
    }
    void bite()
    {
        System.out.println("bittiing..");
    }
}
interface BesicAnimels
{
    void eat();
    void steep();
}
class Human extends Monkey implements BesicAnimels
{
    void speak()
    {
        System.out.println("hello sir!");
    }
    public void eat()
    {
        System.out.println("Eating..");
    }
    public void steep()
    {
        System.out.println("Steeping..");
    }
}
class Pr_03
{
    public static void main(String args[])
    {
        Human h=new Human();
        h.eat();
        h.jump();
        h.speak();
    }
}