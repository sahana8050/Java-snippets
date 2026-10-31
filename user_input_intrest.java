import java.util.Scanner;

public class user_input_intrest {
    
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);


            System.out.println("Enter principle amount");
            double principle=sc.nextDouble();

            System.out.println("Enter rate");
            double rate=sc.nextDouble();

            System.out.println("Enter time");
            double time=sc.nextDouble();
             double simpleInterest = (principle * rate * time) / 100;

        System.out.println("\nSimple Interest = " + simpleInterest);

        sc.close();


        
    }
    
}
