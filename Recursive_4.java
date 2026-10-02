public class Recursive_4 {
    public static void main(String[] args ){
        printnumbers(5); //calling recursive method
    }
    static void  printnumbers(int number)//recursive method
    {
        if (number==0)
            return;
        {
            System.out.println("java");
            printnumbers(number-1);
        }
    }

    
}
