class Arr_pass
{
    static void change(int x)
    {
        x=25;
    }
    static void change1(int arr[])
    {
        arr[0]=98;
    }
    public static void main(String args[])
    {
        //case1:intiger

        // int x=5;
        // System.out.println(x);
        // change(x);     //for int only copy goes to the method main thing is there, thats why does not change
        // System.out.println(x);

        //case2:array

        int marks[]={43,68,12,67,57};
        System.out.println(marks[0]);
        change1(marks);            //for arr the reference that is marks which is pointing to the array is passed to the method thats why method is accessing the array and also changing it..
        System.out.println(marks[0]);

    }
}