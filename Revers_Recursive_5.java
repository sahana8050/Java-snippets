public class Revers_Recursive_5 {
    public static void main(String[] args){
    printRevers(5);
    }
       static void printRevers(int number) 
       {
        if(number==0)
            return;
        {
            System.out.println(number);
            printRevers(number-1);
        }
       } 
    }
    
