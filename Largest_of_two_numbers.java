import java.util.Scanner;
public class Largest_of_two_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
          System.out.println("Enter Second number");
        int b = sc.nextInt();
        
        if (a>=b)
        System.out.println(a +" is greatest number");

        else

      
        System.out.println(b +" is large ");

        

        sc.close();

    }

}