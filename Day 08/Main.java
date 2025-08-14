public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nagarjuna"); // Setting value
        System.out.println("Name: " + p.getName()); // Getting value
    }
}

class Person {
    private String name; // Private field

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
