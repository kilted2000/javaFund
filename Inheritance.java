interface Person {
    void displayPersonDetails();
}

interface Address {
    void displayAddressDetails();
}

 class Contact implements Person, Address {
    // Define attributes for both interfaces and provide implementation for both methods
    // This exercise illustrates how one class can inherit from multiple interfaces.
    @Override
    public void displayPersonDetails(){
        System.out.println("Name: Bob MacBob");
    }

    @Override
    public void displayAddressDetails(){
        System.out.println("338 Staggie Drive");
    }
    
}

public class Inheritance{
    public static void main(String[] args) {
       Contact newContact = new Contact();
       newContact.displayPersonDetails();
       newContact.displayAddressDetails();
    }
}