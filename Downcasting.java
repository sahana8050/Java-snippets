 class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Downcasting {

    public static void main(String[] args) {

        Animal a = new Dog();      // Upcasting

        Dog d = (Dog) a;           // Downcasting

        d.eat();

        d.bark();
    }
}

//converting parent class reference to child class referense  using explicite casta
    

