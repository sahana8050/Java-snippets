public class Amstrong_number {
    public static void main(String[] args) {  // Amstrong number is sum of cube of given number should be equal to original number example 153 1cube 5 cube 3 cube sum=153

        int num=153;
        int original=num;
        int sum=0;

        while(num>0){
            int n=num%10;
            sum=sum+(n*n*n);
            num=num/10;
        }
        if(sum==original){
            System.out.println( original + " is an Amstrong number");
        }
        else
        {
            System.out.println( original +" is not an Amstrong number");
        }

    }}