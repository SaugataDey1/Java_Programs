package Serialization_DeSerialization;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Employee e = new Employee();
        e.setId(1);
        e.setName("CodeDecode");

        // Serialization  ------------------------------
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dey\\Documents\\Serialization\\codeDecodeFile.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        fileOutputStream.close();

        // Deserialization -----------------------------
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dey\\Documents\\Serialization\\codeDecodeFile.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Employee reCreateObj = (Employee) inputStream.readObject();
        System.out.println(reCreateObj.getName());
        inputStream.close();
        fileInputStream.close();
    }
}
