  interface Camera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good morning");
    }   //though we cant call or override by main class   ,we can call through default method 
        //if default methods logic is very high the we can
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Wifi
{
    String[] getNetworks();     //just like a void getNetworks()  onli difference is it will return a string
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
class Defaults
{
    public static void main(String args[])
    {
        SmartPhone sm=new SmartPhone();
        sm.takeSnap();
        sm.recordVideo();
        String[] ar= sm.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }
        sm.connectToNetworks("98.3sm");
        sm.callNumber(8918971627L);
        sm.pickCall(8348210743L);
        sm.record4kVideo();
        // sm.greet()   //--->throws an error because it is a private methode
    }
}