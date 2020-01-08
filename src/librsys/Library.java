package librsys;

import java.util.ArrayList;

public class Library {

    private String location;
    private static ArrayList<Book> books;
    private static ArrayList<Customer> customers;
    private static ArrayList<Loan> loans;

    public Library(String location) {
        this.location = location;
        books = new ArrayList<Book>();
        customers = new ArrayList<Customer>();
        loans = new ArrayList<Loan>();
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

    public void addLoan(Loan loan)
    {
        loans.add(loan);
    }

    public static ArrayList<Loan> getLoans() {
        return loans;
    }

    public boolean loanBook(Customer customer, Book book, int duration)
    {
        if (!book.isOnloan()) {
            Loan loan = new Loan(this, customer, book, duration);
            return true;
        }
        else
        {
           return false;
        }
    }


    public static ArrayList<Book> getBooks() {
        return books;
    }
}
