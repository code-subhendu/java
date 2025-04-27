public class Exception_handaling {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        int a=6000;
        int b=0;        //it will make ArithmeticException
                    //without try....
        int c=a/b;
        System.out.println("The result is : "+ c);

            //if we don't write try-catch then it will not run the below line of codes
            
            //with try.....
            // try{
                //     int c=a/b;
                //     System.out.println("The result is : "+ c);
                // }
                // catch(Exception e){
                    //     System.out.println("we faild to devide. reason is: ");
                    //     System.out.println(e);
                    // }

            //if we write try-catch then it will run below codes 
            //this try-catch save us from unexpected inturuption 
                    
        System.out.println("End of the program");
    }
}
