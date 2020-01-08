package librsys;

import java.util.ArrayList;

public class Customer {

    private int id;
    private String name;
    private static int numOfCustomers = 1;
    private ArrayList<Loan> loans;

    public Customer(Library library, String name) {
        this.id = numOfCustomers++;
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

    public static int getNumOfCustomers() {
        return numOfCustomers;
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
