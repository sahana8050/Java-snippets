class vehical{
    void sound(){
    System.out.println("vehical  giving good miliage");

}

  void  start()
  {
    System.out.println("start bike");
  }

}
class Car extends
vehical{
    void sound()
    {
        System.out.println(" car giving good miliage");
    }
 
}
class Bike extends 
vehical{
    void start()
    {
        System.out.println("bike starts when key on ");

    }

}


public class vehical_upcasting {
    public static void main(String[] args)
    {
        vehical car =new Car();
        car.sound();
        System.out.println("");

        car=new Bike();
        car.start();
        System.out.println("");
    }
    
}
