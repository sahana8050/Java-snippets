public class array_Loop {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        printStarsForArray(numbers);

    }
    public static void printStarsForArray(int[]numbers){
        for(int index=0;index<=numbers.length;index++)
        {
            for(int count=1;count<=numbers[index];count++)
                {

            
            System.out.print("*");
        }
        System.out.println("");
    }


    
    }}
