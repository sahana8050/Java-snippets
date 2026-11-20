public class Method_Overloading_in_methods {
    static void method(int a, int b){
    int add= a+b;{
        System.out.println("addition of numbers is " + add);
    }
}

    static void method(int a, int b, int c){
    int sum=a+b+c;
    {
         System.out.println("addition of numbers is " + sum);
    }
}
public static void main(String[] args){
    method (10,20);
    method (10,20,30);
}
    
}
