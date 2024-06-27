package inputoutput;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "person{name='" + name + "', age=" + age + '}';
    }
}

public class objectserializationio {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public class deserialization {
        public static void main(String[] args) {
            try (FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in  = new ObjectInputStream(fileIn)) {
                Person person = (Person) in.readObject();
                System.out.println("Deserialized Person: " + person);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
