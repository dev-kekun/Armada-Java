package Java_Playground;

public class Student {
    
    String name;
    String section;

    Student(String name, String section){

        this.name = name;
        this.section = section;

        System.out.println("Hello, " + name + " you are section " + section);
    }
}
