public class recursion_in_method {
    static void method(int n){
         if (n>5){
            return;
         }
         System.out.println(n);
         method(n+1);

    }
    public static void main(String[] args){
        method(1);
    }
}
