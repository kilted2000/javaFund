public class Base {
    // Overridable method
    void setup() {
        System.out.println("Base setup");
    }

    // Base constructor
    Base() {
        System.out.println("Base constructor");
        // Calling overridable method inside constructor
        setup();
    }
}

class Derived extends Base {
    private int value;

    // Overriding the setup method
    @Override
    void setup() {
        value = 42;
        System.out.println("Derived setup with value: " + value);
    }

    // Derived class constructor
    Derived() {
        System.out.println("Derived constructor");
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println("Derived object value: " + d.value);
    }
} 
    

