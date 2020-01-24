package librsys;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {

    private int id;
    private String name;
    private ArrayList<Loan> loans;

    public Customer(Library library, String name) {
        this.id = library.newCustomerId();
        this.name = name;
        loans = new ArrayList<Loan>();
        library.addCustomer(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLoan(Loan loan)
    {
        loans.add(loan);
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
