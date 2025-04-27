public class Logical_Error {
    public static void main(String[] args) {
        //write a program to print all prime numbers between 1 to 10
        // System.out.println(2);
        // for (int i=3;i<=10;i++)
        // {
        //     int temp=0;
        //     for(int j=2;j<i;j++)
        //     {
        //         if(i%j==0)
        //         {
        //             temp=1;
        //         }
        //     }
        //     if(temp==0)
        //     {
        //         System.out.println(i);
        //     }
            
        // }       //this is the right logic 

        //but if i write wrong logic like--
        System.out.println(2);
        for (int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }  //this will not show any error but this is not printing the thigs what we are wanted to print

    }
}
