import java.util.Scanner;

public class adding_two_numbers {
    public static void main(String[]args ){
        Scanner object=new Scanner(System.in);

        System.out.println("Enter first number");
        int number= object.nextInt();
        
        System.out.println("Enter second number");
        int number1= object.nextInt();
      
        int sum=number+number1;
        System.out.println("Sum of two integers is  " +sum);

        object.close();

    }
    
}
