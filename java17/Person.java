package java17;

public class Person {
    String name;
    int age;

    // Make the constructor public
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        
        Object obj = new Person("Alice", 30);

//        switch (obj) {
//            case Person(String name, int age) && age >= 18 -> 
//                System.out.println(name + " is an adult, age: " + age);
//            case Person(String name, int age) && age < 18 -> 
//                System.out.println(name + " is a minor, age: " + age);
//            default -> 
//                System.out.println("Unknown object");
//        }
        
    }
}
