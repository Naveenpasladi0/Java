package generics.interfaces;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableinterfaces {
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }

        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Alice", 30));
            people.add(new Person("John", 45));
            people.add(new Person("Charlie", 28));
            Collections.sort(people);
            System.out.println("Sorted People: " + people);

        }
    }
}