import java.util.Scanner;
public class usre_input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your name");
         String name=sc.next();
          System.out.println("hello " + name);
          sc.close();
    }
    
}
