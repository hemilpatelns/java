package externalization;

import java.io.*;

public class ExampleExternalizable {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(1);
        e.setEmployeeName("Hemil");
        e.setSalary(30000);

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\OOPS Concepts\\src\\externalization\\Externalizable.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\OOPS Concepts\\src\\externalization\\Externalizable.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            oos.writeObject(e);
            System.out.println("File write done");

            Employee e1 = (Employee) ois.readObject();
            System.out.println(e1);

        }catch(IOException | ClassNotFoundException ie){
            ie.printStackTrace();
        }
    }
}
