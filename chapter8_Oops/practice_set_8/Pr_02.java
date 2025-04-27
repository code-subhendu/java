class CellPhone
{
    void ring()
    {
        System.out.println("phone is ringing...");
    }
    void vibrate()
    {
        System.out.println("phone is vibrating...");
    }
}
class Pr_02
{
    public static void main(String args[])
    {
        CellPhone vivo =new CellPhone();
        vivo.ring();
        vivo.vibrate();
    }
}