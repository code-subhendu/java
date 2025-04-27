abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartPhone extends TelePhone
{
    void ring()
    {
        System.out.println("Ringng..");
    }
    void lift()
    {
        System.out.println("connecting..");
    }
    void disconnect()
    {
        System.out.println("disconnectiong..");
    }
    void camera()
    {
        System.out.println("Turning on  camera");
    }
    void palyMusic()
    {
        System.out.println("playing music..");
    }
}
class Pr_04
{
    public static void main(String args[])
    {
        TelePhone t=new SmartPhone();
        t.ring();
        //t.camera();---->error
    }
}