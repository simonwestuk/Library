package librsys;

import java.io.*;
import java.util.ArrayList;

public class Database {

    Library lib;
    DataSet data;
    String fileName = "Data.dat";

    public Database(Library lib) throws IOException {
        this.lib = lib;
        this.data = new DataSet();
        loadFiles();
    }

    public void loadFiles() throws IOException {
        if (checkFile(fileName))
        {
            loadData();
        }
        else
        {
            saveData();
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

    public void saveData() throws FileNotFoundException {
        try
        {
            data.save(lib);
            System.out.println("SAVE " + data.toString());
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(data);

            objectOut.close();
            fileOut.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void loadData() throws IOException {

        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            data = (DataSet) objectIn.readObject();
            System.out.println("LOAD " + data.toString());
            data.load(lib);
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }



}
