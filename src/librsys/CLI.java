package librsys;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLI {

    Library lib;
    InputStreamReader reader;
    BufferedReader input;

    public CLI(Library lib) throws IOException {
        reader = new InputStreamReader(System.in);
        input = new BufferedReader(reader);
        this.lib = lib;
        createMenu();
    }

    private void createMenu() throws IOException {
        System.out.println("Welcome to Library v1.0");
        System.out.println("═══════════════════════");
        System.out.println("1. Manage Customers");
        System.out.println("2. Manage Books");
        System.out.println("3. Manage Loans");
        System.out.print("Enter choice:");
        String choice = input.readLine();

        if (validateChoice(choice, 3))
        {
            switch(choice) {
                case "1":
                    crudMenu("Customers");
                    break;
                case "2":
                    crudMenu("Books");
                    break;
                case "3":
                    crudMenu("Loans");
                    break;
            }
        }
        else
        {
            createMenu();
        }

    }

    private void crudMenu(String type) throws IOException {
        System.out.println("═══════════════════════");
        System.out.println("1. Create " + type);
        System.out.println("2. View " + type);
        System.out.println("3. Update " + type);
        System.out.println("4. Delete " + type);
        System.out.print("Enter choice:");
        String choice = input.readLine();
        if (validateChoice(choice, 4))
        {
            switch(choice) {
                case "1":
                    create(type);
                    break;
                case "2":
                    view(type);
                    break;
                case "3":
                    //update(type);
                    break;
                case "4":
                    //delete(type);
                    break;
            }
        }
        else
        {
            crudMenu(type);
        }
    }

    private boolean validateChoice(String choice, int maxValue) throws NumberFormatException
    {
        int value = 0;
        try
        {
            value = Integer.parseInt(choice);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Not a valid option.");
            return false;
        }

        if (value > maxValue || value <= 0)
        {
            System.out.println("Not a valid option.");
            return false;
        }
        return true;
    }

    private void create(String type) throws IOException {
        switch(type) {
            case "Customers":
                System.out.print("Enter new Customer name:");
                String name = input.readLine();
                new Customer(lib, name);
                lib.saveAll();
                System.out.println(name + " Added.");
                createMenu();
                break;
            case "Books":

                break;
            case "Loans":

                break;
        }
    }

    private void view(String type) throws IOException {
        switch(type) {
            case "Customers":
                System.out.print(lib.getCustomers().toString());

                break;
            case "Books":

                break;
            case "Loans":

                break;
        }
    }
}
