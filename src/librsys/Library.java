package librsys;

import java.util.ArrayList;

public class Library {

    private String location;
    private static ArrayList<Book> books;
    private static ArrayList<Customer> customers;

    public Library(String location) {
        this.location = location;
        books = new ArrayList<Book>();
        customers = new ArrayList<Customer>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
