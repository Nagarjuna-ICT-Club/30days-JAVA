public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}

interface Animal {
    void sound();
}

abstract class Mammal {
    abstract void eat();
}

class Dog extends Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}
