import java.util.Scanner;
public class multiple_user_input {
    public static void main(String[] arg){
        Scanner object =new Scanner(System.in);
        System.out.println("Enter your fav book");
        String object0=object.next();

        System.out.println(object0+" is my fav");
        System.out.println("Enter your fav color");
        String object1=object.next();
        System.out.println(object1+" is my fav");

        System.out.println("Enter your fav bird");
        String object3=object.next();
        System.out.println(object3+" is my fav");

         System.out.println("Enter your fav bird");
        String object4=object.next();
        System.out.println(object4+" is my fav");
        object.close();
    }
    
}
