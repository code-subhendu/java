import java.util.Scanner;
class Specific_exception
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int marks[]=new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        System.out.println("Enter the array index: ");
        int ind=sc.nextInt();
        System.out.println("Enter the number you want to devide the value with: ");
        int number=sc.nextInt();
        try{
            System.out.println("The value at arrray index Entered is: "+marks[ind]);
            System.out.println("The value of array value/number is: "+ marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}