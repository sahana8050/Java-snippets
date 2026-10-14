public class pattern_5 {
    public static void main(String[] args){
        int [] numbers={1,2,3,4,5};
        printStarOfArray(numbers);
    }
    public static void printStarOfArray(int[]numbers){
        for(int index=0;index<numbers.length;index++){
            for(int count=1;count<=numbers[index];count++){
                System.out.print("*");
            }
            System.out.println("");
            
            for(int i=0;i<numbers.length;i++){
            for(int count=1;count<=numbers[i];count++){
                System.out.print("*");
            }
            System.out.println("");
        }}


    }
    
    }
