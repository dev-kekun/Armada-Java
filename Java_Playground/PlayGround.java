package Java_Playground;
import java.util.Scanner;
public class PlayGround {
    public static void main(String[] args) {
        
        // Product p1 = new Product("Milk", 105.75d);
        // Person person1 = new Person("Ricky", "David", 'M', 24);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student name:");
        String name = scan.nextLine();

        System.out.print("Enter student section:");
        String section = scan.nextLine();
        
        Student s1 = new Student(name, section);

    }
}
