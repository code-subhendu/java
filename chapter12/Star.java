package abc.p.p2;
// import java.util.Scanner;
// import java.util.*;    //we can use this to import all java.util packages including java.util.Scanner  
class Star
{
    public static void main (String args[])
    {
        System.out.print("Enter number: ");
        // Scanner sc =new Scanner(System.in);        //use this while you imported java.util.Scanner above
        java.util.Scanner sc =new java.util.Scanner(System.in);        //you can use this without importing java.util.Scanner
        int a =sc.nextInt();
        System.out.println("Hiii dear.. \n  I love you "+a+" times more than you");
    }
}
