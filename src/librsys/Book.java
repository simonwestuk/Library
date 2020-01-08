package librsys;

public class Book {

    private int ISBN;
    private String title;
    private Author author;
    private Genre genre;
    private boolean onloan;

    public Book(Library library, int ISBN, String title, Author author, Genre genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.onloan = false;
        author.addBook(this);
        library.addBook(this);
    }

    public Book(int ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isOnloan() {
        return onloan;
    }

    public void setOnloan(boolean onloan) {
        this.onloan = onloan;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
