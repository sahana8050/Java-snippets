import java.util.Scanner;
public class multiple_user_input {
    public static void main(String[] arg){
        Scanner object =new Scanner(System.in);
        System.out.println("Enter your fav book");
        String sc=object.next();

        System.out.println(sc+" is my fav");
        System.out.println("Enter your fav color");
        String sc1=object.next();
        System.out.println(sc1+" is my fav");

        System.out.println("Enter your fav bird");
        String sc3=object.next();
        System.out.println(sc3+" is my fav");

        object.close();
    }
    
}
