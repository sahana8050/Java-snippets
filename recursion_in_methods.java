public class recursion_in_methods {
    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args){
    print(1);
    }}
