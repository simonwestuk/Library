package librsys;

import java.io.Serializable;
import java.util.ArrayList;

public class DataSet implements Serializable {

    private ArrayList<Book> books;
    private ArrayList<Customer> customers;
    private ArrayList<Loan> loans;

    public DataSet() {
    }

    public void save(Library lib)
    {
        books = lib.getBooks();
        customers = lib.getCustomers();
        loans = lib.getLoans();
    }

    public void load(Library lib)
    {
        lib.setCustomers(customers);
        lib.setBooks(books);
        lib.setLoans(loans);
    }
}
