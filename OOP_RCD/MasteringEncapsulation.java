class Student{
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}

    
public class MasteringEncapsulation {
    public static void main(String[] args) {
        Student student = new Student("James", 24);
        student.displayInfo();

        student.setName("John Doe");
        student.setAge(25);
        student.displayInfo();
    }
}
