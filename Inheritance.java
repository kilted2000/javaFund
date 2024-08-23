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
    public void displayAddressDeta