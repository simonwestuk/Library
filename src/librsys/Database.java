package librsys;

import java.io.*;
import java.util.ArrayList;

public class Database {

    Library lib;

    public Database(Library lib) throws IOException {
        this.lib = lib;
        loadFiles();
    }

    public void loadFiles() throws IOException {
        if (checkFile("Customers.dat"))
        {
            loadCustomers("Customers.dat");
        }
        else
        {
            saveCustomers("Customers.dat", lib.getCustomers());
        }
    }

    public boolean checkFile(String fileName)
    {
        File f = new File(fileName);
        if(f.exists() && !f.isDirectory()) {
           return true;
        }
        return false;
    }

    public void saveCustomers(String fileName, ArrayList<Customer> arrayList) throws FileNotFoundException {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(arrayList);

            objectOut.close();
            fileOut.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void loadCustomers(String fileName) throws IOException {

        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            lib.setCustomers((ArrayList<Customer>) objectIn.readObject());

        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }



}
