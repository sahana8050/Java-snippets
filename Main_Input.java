public class Main_Input {
    public static void main(String [] args)
    {
        System.out.println("hello world");
        printArguments(args);
    }
    
        public static void printArguments(String [] args){
        System.out.println("Number of Arguments:"+args.length);
        for( int i=0;i<args.length; i++)
        { 
            System.out.println("args["+i+"]:" +args[i]);
        }
        
    }

    

}
