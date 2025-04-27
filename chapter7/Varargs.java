class Varargs
{
     //without using so many methods we can use this --> it creats an array it takes how much value you want 
    static int sum(int ...arr)      
    {
        int t=0;
        for (int a:arr)
        {
            t=t+a;
        }
        return t;
    }
    public static void main(String args[])
    {
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,2,5,7));
        System.out.println(sum());  //if i don't give any value array initialize with zero and also it returns zero
        
    }
}