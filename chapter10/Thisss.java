class A{
    int x;
    A(int v){
        // x=v;
        this.x=v;
    }
    public int returnone(){
        return 1;
    }
}
class B extends A{
    B(int k){
        super(k);
        System.out.println("I am a constructor ");
    }
}
class Thisss
{
    public static void main (String args[])
    {
        // A a=new A(5);
        // System.out.println(a.x);
        B b=new B(45);
        System.out.println(b.x);
    }
}