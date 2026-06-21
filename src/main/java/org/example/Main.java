package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        Person secondPerson = new Person(
                "Jane",
                "Doe",
                18,
                "jane.doe@example.com",
                "555-0101",
                "Istanbul"
        );
        Wall wall = new Wall(5, 4);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is teen: " + secondPerson.isTeen());
        System.out.println("Wall area: " + wall.getArea());
    }
}
