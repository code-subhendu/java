class Array_1
{
    public static void main(String args[])
    {
        // int arr[]={32,35,567,23,31};
        // float arr[]={32,35.1f,567,23.6f,31};
        String arr[]={"kakoli","pratima","priya","sovona"};
        System.out.println(arr.length);
        // System.out.println(arr[3]);
        // System.out.println(arr[0]);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //reverse order
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        //for each loop

        for (String element:arr)
        {
            System.out.println(element);
        }


        int raw[]={3,5,6,7,2,1};
        for(int element:raw)
        {
            System.out.println(element);
        }
        
    }
}