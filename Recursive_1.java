public class Recursive_1 {
    public static void main(String[] args){
        A();
    }
   
         static int count=0;
        static void A()
        {
        if(count==4)
        return;
        {
            count++;
            System.out.println(" hello"+count);
            A();
            
        }
    }}
    
