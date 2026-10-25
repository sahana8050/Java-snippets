class Animal{ //upcasting process is to converting child class object into a parent class reference  
            void eat(){
                System.out.println("animal is eating");
            }
        }

        class Dog extends                             //Animal-> parent classs
        Animal{                                       //dog->child class
                                                       //a-> parent reference
                                                      //new dog()->child object 
            void bark(){                               //same variablr different object called polymorphism
                System.out.println("dog is barking");  //mainly used to achive run time polymorphisum
            }
        }

        class Cat extends
        Animal{
            void noice()
            {
                System.out.println("cat is disturbing ");
            }
        }
        public class upcasting
        {
            public static void main(String[]args){
           Animal a=new Cat();
                                   //Animal a=new Dog();
                
                  
                 a.eat();
               
                
            }
        }
    

    
   