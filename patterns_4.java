public class patterns_4 {
    public static void main(String[] args){
        int[] numbers={8,7,6};
        printStarsOfArray(numbers);
    }
    public static void printStarsOfArray(int[]numbers){
        for(int index=0;index<numbers.length;index++)
        {
            for(int count=1;count<numbers[index];count++)
                
            
           //System.out.print("--"); 
            {
                System.out.print("*"); 
            }
            System.out.println("--");
        }

        
    }}

    
