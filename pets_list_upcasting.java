class Animal{
    void treatment(){
        System.out.println("Animal is receving treatment");
    }
    void sound(){
        System.out.println("Animal is making sound");
    }
}
class Dog extends
Animal{
    void sound(){
        System.out.println("Dog says:bow bow");
    }
}
class Cat extends
Animal{
    void sound(){
        System.out.println("cat says:meow");
    }

}
class cow extends 
Animal{
    void sound(){
        System.out.println("cow says:moo");
    }
}
public class pets_list_upcasting{
    public static void main(String[] args){
   
    Animal patient =new Dog();
    patient .treatment();
    patient.sound();

    System.out.println();
    
    patient=new Cat();
    patient .treatment();
    patient.sound();

    System.out.println();
  
    patient=new cow();
    patient .treatment();
    patient.sound();

    System.out.println();

}
}


