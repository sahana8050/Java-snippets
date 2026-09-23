class Calculator                   //class
{
    int a;
    public int  add( int n1, int n2) 
    {
        int r =n1+n2;
        return r;
    }             //object can add two values 
}

public  class classObject {
    public static void main( String a[]) 

    {
        int num1=6;
        int num2=8;
        Calculator calc = new Calculator();
        int r =calc.add(num1,num2);
        System.out.println(r);
    }

    
}
