class Varargs1
{
     //without using so many methods we can use this --> it creats an array it takes how much value you want 
    static int sum(int x,int ...arr)      
    {
        int t=x;
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
        System.out.println(sum(3));  //as there is a int value in the method so we must put atleast one number while calling
        
    }
}