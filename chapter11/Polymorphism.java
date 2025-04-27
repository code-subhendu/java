interface Camera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good morning");
    } 
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Wifi
{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class Cellphone
{
    public void callNumber(long phoneNumber)
    {
        System.out.println("Calling  "+phoneNumber);
    }
    public void pickCall(long phoneNumber)
    {
        System.out.println("Connecting..  "+phoneNumber);
    }
}
class SmartPhone extends Cellphone implements Wifi,Camera
{
    public void takeSnap()
    {
        System.out.println("Taking snap.. ");
    }
    public void recordVideo()
    {
        System.out.println("Recording video.. ");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of networks..");
        String[] networkList={"Harry","Subhendu","Shri Krishna"};
        return networkList;
    }
    public void connectToNetworks(String network)
    {
        System.out.println("Connecting to "+network);
    }
    public void record4kVideo()
    {
        System.out.println("Taking snap and Recording in 4k...");
    }
}
class Polymorphism
{
    public static void main (String args[])
    {
        Camera c=new SmartPhone();   // this is a smartphone ,use it as a camera. //can only use methods of Camera interface
        c.takeSnap();
        // c.getNetworks()  -->not allowed cant access
        SmartPhone s =new SmartPhone();   //can use all the methods that are in the SmartPhone class
        s.getNetworks();
    }
}