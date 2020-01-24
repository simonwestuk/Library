package librsys;

import java.io.IOException;

public class Library {

    private String location;
    private Database database;

    public Library(String location) throws IOException {
        this.location = location;
        database = new Database(this);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void addBook(Book book)
    {
        database.data().getBooks().add(book);
    }

    public void addCustomer(Customer customer)
    {
        database.data().getCustomers().add(customer);
    }

    public void addLoan(Loan loan)
    {
        database.data().getLoans().add(loan);
    }


    public int newCustomerId()
    {
        return getDatabase().data().nextCustomerId();
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

    public Database getDatabase() {
        return database;
    }
}
