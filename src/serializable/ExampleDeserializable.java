package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExampleDeserializable {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\OOPS Concepts\\src\\serializable\\Serialization.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Employee e = (Employee) ois.readObject();
            System.out.println(e);
        }catch(IOException | ClassNotFoundException ie){
            ie.printStackTrace();
        }
    }
}
