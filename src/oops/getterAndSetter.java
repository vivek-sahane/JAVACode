package oops;

public class getterAndSetter {

    public static class Person {
        // Private fields
        private String name;
        private int age;

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Setter methods
        public void setName(String newName) {
            this.name = newName;
        }

        public void setAge(int newAge) {
            // You can add validation logic here if needed
            this.age = newAge;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Use setter methods to set values
        person.setName("John Doe");
        person.setAge(25);

        // Use getter methods to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
