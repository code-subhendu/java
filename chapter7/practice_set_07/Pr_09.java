class Pr_09
{
    static double convert_c_f(int t)
    {
        double f=32+(9.0/5.0)*t;
        return f;
    }
    public static void main(String args[])
    {
        System.out.println(convert_c_f(8));
    }
}