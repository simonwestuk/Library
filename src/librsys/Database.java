package librsys;

import java.io.*;

public class Database {

    private Library lib;
    private Dataset data;
    private String fileName;

    public Database(Library lib) throws IOException {
        this.lib = lib;
        this.fileName = lib.getLocation() + ".dat";
        this.data = new Dataset();
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

    public Dataset data() {
        return data;
    }

    public void loadData() throws IOException {

        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            data = (Dataset) objectIn.readObject();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

}
