package librsys;

public class Customer {

    private int id;
    private String name;
    private static int numOfCustomers = 1;

    public Customer(Library library, String name) {
        this.id = numOfCustomers++;
        this.name = name;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
