package data;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    public static final String filePath = "src/data/employees.ser";

    public FileHandler() {
    }

    public static void writeData(ArrayList myCollection) throws IOException {
        FileOutputStream outFile = new FileOutputStream("src/data/personal1.ser");
        ObjectOutputStream outStream = new ObjectOutputStream(outFile);
        outStream.writeObject(myCollection);
    }

    public static ArrayList readData() throws IOException, FileNotFoundException, ClassNotFoundException {
        new ArrayList();
        FileInputStream inFile = new FileInputStream("src/data/personal1.ser");
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        ArrayList collectionFromFile = (ArrayList)inStream.readObject();
        return collectionFromFile;
    }
}
