import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start with a do-while loop to keep showing the menu until the user chooses to exit
        int choice;
        do {
            // Print out the menu
            System.out.println("\\nMenu:");
            System.out.println("1. Calculator");
            System.out.println("2. Conversion Tools");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Calculator chosen!");
                    // Implement the calculator here...
                    break;
                case 2:
                    System.out.println("Conversion tools chosen!");
                    // Implement conversion tools here...
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select from the menu.");
                    break;
            }
        } while (choice != 3);  // Exit when user chooses 3

        scanner.close();
    }
}
