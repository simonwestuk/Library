package librsys;
import java.io.Serializable;
import java.util.ArrayList;

public class Author implements Serializable {

    private String name;
    private ArrayList<Book> books;

    public Author(String name) {
        this.name = name;
        books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }
}
