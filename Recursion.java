public class Recursion {
    public static void main(String[] args){
        //the code written before recursion function will run while pushing to stack 
       // after recursion code will runs while popping from stack
     // break condition is important

     countdown(5);
    }
     
        static void countdown(int number){
            if(number==0){
                System.out.println("finished!");
                return;
            }
            System.out.println(number);
            countdown(number-1);
        }
    }


    

