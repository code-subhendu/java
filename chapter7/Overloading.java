class Overloading
{
    static void foo()
    {
        System.out.println("Good morning bro!");
    }
    static void foo(int a)
    {
        System.out.println("Good morning bro!"+a+"hi");
    }

        //although it is int ,different from the above void but can't differenciate --.gives error
    // static int foo(int a)
    // {
    //     System.out.println("Good morning bro!"+a+"hi");
    //     return a;
    // }
    static void foo(int a,int b)
    {
        int c=a+b;
        System.out.println("Good morning bro!"+c+"hooo");
    }
    public static void main(String args[])
    {
        foo();
        foo(5);
        foo(4,5);
    }
}