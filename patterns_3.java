public class patterns_3 {
     public static void main(String[] args){
        int[] numbers={-1,-1,-1,0,0,0};
        printStarsOfArray(numbers);
    }
    public static void printStarsOfArray(int[]numbers){ 
        for(int index=0;index<numbers.length;index++)
        {
            for(int count=1;count<=numbers[index];count++)
            {
                System.out.print("*");
            }
            System.out.println("-");

    }
    
    }}


