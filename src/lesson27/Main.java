package lesson27;

public class Main {
    /*
    book - title, author, status (enum)
    enum - available, borrowed
    interface - borrowBook, returnBook
     */
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Oruel", Status.AVAILABLE);
        book1.borrowBook(book1.getTitle());
//        book1.borrowBook(book1.getTitle());

        book1.returnBook(book1.getTitle());
    }
}
