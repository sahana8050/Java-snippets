class Animal{
            void eat(){
                System.out.println("animal is eating");
            }
        }

        class Dog extends
        Animal{

        
            void bark(){
                System.out.println("dog is barking");
            }
        }
        public class upcasting
        {
            public static void main(String[]args){
                Dog a=new Dog(); //Animal a=new Dog();
                a.eat();
                a.bark();
            }
        }
    

    
   