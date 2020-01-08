package librsys;
import java.util.Date;

public class Loan {

    private int id;
    private Customer customer;
    private Book book;
    private Date date;
    private int duration;
    private static int numOfLoans = 1;

    public Loan(Library library, Customer customer, Book book, int duration) {
        this.id = numOfLoans++;
        this.customer = customer;
        this.book = book;
        this.date = new Date();
        this.duration = duration;
        library.addLoan(this);
        customer.addLoan(this);
        book.setOnloan(true);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static int getNumOfLoans() {
        return numOfLoans;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
