import java.util.Scanner;
public class Fibonacci_Scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number of terms");
        int n=sc.nextInt();
        int first=0;
        int second=1;

        System.out.println("fibonacci series");
        for(int i=1;i<=n;i++){
            System.out.println(first + "");
       int next= first+second;
        first=second;
        second=next;}
        

        sc.close();



        
    }

}