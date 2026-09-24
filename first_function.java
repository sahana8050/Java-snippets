public class first_function {
    public static void main(String[] args)
    {
        nothingwilldo(); //function invocation calling function 
    }
    public static void nothingwilldo()// function definition 
    {
        String massage= "welcome to java snippets ";
        printmassage(massage);         // by using methos  we can reuse 
    }
     
     static String printmassage(String massage)
    {
        System.out.println(massage);
        return massage;


    }
    
    

}
