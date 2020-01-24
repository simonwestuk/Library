package librsys;

import java.io.Serializable;
import java.util.ArrayList;

public class Dataset implements Serializable {

    private ArrayList<Book> books;
    private ArrayList<Customer> customers;
    private ArrayList<Loan> loans;
    private int lastCustomerId;

    public Dataset() {
         books = new ArrayList<>();
         customers = new ArrayList<>();
         loans = new ArrayList<>();
         lastCustomerId = 1;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public int nextCustomerId() {

        lastCustomerId++;
        return lastCustomerId - 1;
    }

}
