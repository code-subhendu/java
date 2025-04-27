class Methodd
{
    public static void main(String args[])
    {
        String a = "Hi I am Subhendu   Maiti        ";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        System.out.println(a.substring(11));
        System.out.println(a.substring(11,19));
        System.out.println(a.replace("i","k"));
        System.out.println(a.startsWith("H"));
        System.out.println(a.endsWith(" "));
        System.out.println(a.charAt(9));
        System.out.println(a.indexOf("bh"));
        System.out.println(a.indexOf("bh",16));
        System.out.println(a.lastIndexOf("i"));
        System.out.println(a.lastIndexOf("i",4));
        System.out.println(a.equals("Hi I am Subhendu   Maiti        "));
        System.out.println(a.equalsIgnoreCase("hi I am suBhendu   Maiti        "));
    } 
}