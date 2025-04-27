interface Bicycle
{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);

}
interface HornBicycle
{
    void blowHornk3g();
    void blowHornmnh();
}
class AvonCycle implements Bicycle,HornBicycle
{
    void blowHorn()
    {
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int decrement)
    {
        System.out.println("Apply break");
    }
    public void speedUp(int increment)
    {
        System.out.println(" Apllying speeding up..");
    }
    public void blowHornk3g()
    {
        System.out.println("kabhi khusi kabhi gum pe pe pe");
    }
    public void blowHornmnh()
    {
        System.out.println("Main hoon na po po poo");
    }
}
class Interface
{
    public static void main(String args[])
    {
        AvonCycle avon =new AvonCycle();
        avon.applyBreak(1);
        System.out.println(avon.a);
        // avon.a=56;  //we can't modify variables as they are final
        // System.out.println(avon.a);
        avon.blowHornk3g();
        avon.blowHornmnh();

    }
}