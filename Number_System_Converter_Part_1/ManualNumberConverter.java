package Number_System_Converter_Part_1;
import java.util.Scanner;

public class ManualNumberConverter {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scan.nextInt();

        System.out.println();
        System.out.println("=== Number System Conversions ===");

        // Store the original number for later use in other conversions
        int originalNumber = number;

        // Binary Conversion
        StringBuilder toBinary = new StringBuilder();
        
        if (number == 0) {
            toBinary.append("0");
        } else {
            while (number > 0) {
                toBinary.insert(0, number % 2);
                number = number / 2; 
            }
        }

        System.out.println("Binary: " + toBinary.toString());
        
        // Reset number to original value for octal conversion
        number = originalNumber;
        
        // Octal Conversion
        int octalNumber = 0;
        int placeValue = 1;
        
        if (number == 0) {
            System.out.println("Octal: 0");
        } else {
            while (number > 0) {
                int remainder = number % 8;
                octalNumber += remainder * placeValue;
                number = number / 8;
                placeValue *= 10;
            }
            System.out.println("Octal: " + octalNumber);
        }

        // Reset number to original value for hexadecimal conversion
        number = originalNumber;

        // Hexadecimal Conversion
        StringBuilder toHexadecimal = new StringBuilder();
        
        if (number == 0) {
            toHexadecimal.append("0");
        } else {
            while (number > 0) {
                int remainder = number % 16;
                if (remainder < 10) {
                    toHexadecimal.insert(0, remainder); 
                } else {
                    char hexChar = (char) ('A' + (remainder - 10));
                    toHexadecimal.insert(0, hexChar);
                }
                number = number / 16;
            }
            System.out.println("Hexadecimal: " + toHexadecimal.toString());
        }
    }
}
