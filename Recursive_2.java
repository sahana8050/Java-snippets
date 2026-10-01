public class Recursive_2 {
    public static void main(String[] args){
         B();
    }
        static int count=0;
        static void B()
       
        {
            if(count==4)
                return;
            {
                count++;
                System.out.println(count);
                B();
            }
        }

    }

