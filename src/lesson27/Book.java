package lesson27;

public class Book implements IBook {
    // bu klassda override lari duzeltmek lazimdi
    // return ve borrowdaki parametler lazimsizdirsa duzeltmek lazimdi
    private String title;
    private String author;
    private Status bookStatus;

    public Book(String title, String author, Status bookStatus) {
        this.title = title;
        this.author = author;
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Status getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Status bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void borrowBook(String title) {
        if (getBookStatus().equals(Status.AVAILABLE)) {
            System.out.println("You have borrowed a book successfully");
            setBookStatus(Status.BORROWED);
        } else {
            try {
                throw new Exception("Book is out of stock");
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }

    @Override
    public void returnBook(String title) {
        setBookStatus(Status.AVAILABLE);
        System.out.println(title + " now is available");
    }
}
