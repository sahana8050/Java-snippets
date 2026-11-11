import java.util.Scanner;
public class area_of_rectangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        int length=sc.nextInt();
        System.out.println("Enter the width of rectangle");
        int width=sc.nextInt();

        int area=length*width;
        System.out.println("The area of rectangle is "+area);
        sc.close();

    }
    
}
