public class Recursive_3{
    public static void main(String[] args){
        printnumbers(5); //

    }
     static void printnumbers(int number)          //recursive method
    {
    if(number==0)                                 //this is the base case
        return ;
    {
       // number++;                                //this will cause infinite loop

        System.out.println("hello "+number);
        printnumbers(number-1);                   //recursive call

    } 
    }}
