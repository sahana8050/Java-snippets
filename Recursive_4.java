public class Recursive_4 {
    public static void main(String[] args ){
        printnumbers(5);                     //calling recursive method
    }
    static void  printnumbers(int number)            //recursive method
    {
        if (number==0)
            return;
        {
            System.out.println("before the recursive call "+number);
            printnumbers(number-1);

            
            System.out.println("after the recursive call "+number); //this statement will be executed after the recursive call is completed
        
    } 

    
    }}
