package lesson27;

public interface IBook {

    void borrowBook(Status status);

    void borrowBook(String title);

    void returnBook(Status status);

    void returnBook(Book book);

    void returnBook(Book book, Status bookStatus);
}
