class Phone
{
    public void showTime()
    {
        System.out.println("The time is 8 am");
    }
    public void on()
    {
        System.out.println("Turning on phone..");
    }
}
class SmartPhone extends Phone
{
    public void music()
    {
        System.out.println("Playing music..");
    }
    public void on()
    {
        System.out.println("Turning on smartphone..");
    }
}
class DynamicMethodDispatch
{
    public static  void main(String args[])
    {
        // Phone p=new Phone();
        // SmartPhone s=new SmartPhone();
        // p.on();
        // s.on();
        SmartPhone r=new Phone();    //not allowed
        Phone q=new SmartPhone();   //allowed
        q.on();     //as q is the object of Smartphone that's why it call SmartPhone class mathod
        q.music();  //not allowed
    }
}