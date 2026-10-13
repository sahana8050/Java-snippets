public class patterns_4 {
    public static void main(String[] args){
        int numbers[]={2,4,6,8};
        printStarsOfArray(numbers);
    }
    public static void printStarsOfArray(int[]numbers){
        for(int index=0;index<numbers.length;index++)
        {
            for(int count=0;count<numbers[index];count++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }}

    