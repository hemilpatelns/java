package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;

public class ExampleSerializable {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(1);
        e.setEmployeeName("Hemil");
        e.setSalary(30000);

        // Using try with resources so output stream objects will get closed automatically
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\OOPS Concepts\\src\\serializable\\Serialization.ser"); // File Path
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(e);

            System.out.println("Your data is serialized");
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
