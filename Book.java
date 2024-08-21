class Book {
    // Attributes for the Book class
    String title;
    String author;

    // Method to display book information
    void showBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        // Creating an object of the Book class
        Book myBook = new Book();
        myBook.title = "The Great Gatsby";
        myBook.author = "F. Scott Fitzgerald";

        // Displaying the book's details
        myBook.showBookInfo();
    }
}
