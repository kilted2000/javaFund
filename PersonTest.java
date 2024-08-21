class Person {

    // Attributes of the Person class.
    String name;
    int age;

    // Static variable to keep count of the number of Person objects created.
    static int personCount = 0;

    // Default constructor.
    public Person() {
        personCount++; // Increment the count whenever a new Person object is created.
    }

    // Parameterized constructor using the 'this' keyword to initialize the attributes.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++; // Increment the count whenever a new Person object is created.
    }

    // speak() method to let the person introduce themselves.
    public void speak() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }

    // Static method to display the number of Person objects created.
    public static void displayCount() {
        System.out.println("Total number of persons: " + personCount);
    }
}
public class PersonTest {

    public static void main(String[] args) {

        // Instantiating three different Person objects.
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 35);
        Person person4 = new Person("Richard", 41);

        // Calling the speak() method for each Person object.
        person1.speak();
        person2.speak();
        person3.speak();
        person4.speak();

        // Displaying the number of Person objects created using the static method.
        Person.displayCount();
    }
}