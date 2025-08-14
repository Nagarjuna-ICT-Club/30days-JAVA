public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Buddy");
        myDog.bark();
        System.out.println("Dog's name is: " + myDog.getName());
    }
}

class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
