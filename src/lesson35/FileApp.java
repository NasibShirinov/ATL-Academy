package lesson35;

import javax.naming.ContextNotEmptyException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileApp {
    public static final String RESOURCE = "src/lesson35/resource/";

    public static void main(String[] args) {
        Person person = new Person("Kamil", "Ibadov", 28);

        try (FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.getMessage();
        }

        try (FileInputStream fos = new FileInputStream(RESOURCE + "person.ser");
             BufferedInputStream bos = new BufferedInputStream(fos);
             ObjectInputStream oos = new ObjectInputStream(bos)) {
            Object object = oos.readObject();
            if (object instanceof Person) {
                System.out.println(object);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }

        List<Person> list = new ArrayList<>();
        list.add (new Person("M", "M", 11));
        list.add (new Person("A", "A", 22));
        list.add (new Person("B", "B", 33));

        try (FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.getMessage();
        }

        try (FileInputStream fos = new FileInputStream(RESOURCE + "person.ser");
             BufferedInputStream bos = new BufferedInputStream(fos);
             ObjectInputStream oos = new ObjectInputStream(bos)) {
            Object object = oos.readObject();
            if (object instanceof ArrayList<?>) {
                System.out.println(object);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }

    }


}
