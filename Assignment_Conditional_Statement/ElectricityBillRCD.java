package Assignment_Conditional_Statement;
import java.util.Scanner;

public class ElectricityBillRCD {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int unitsConsumed = scan.nextInt();
        double totalBill = 0;;

        if (unitsConsumed <= 100) {
            totalBill = unitsConsumed * 1.50;
        } else if (unitsConsumed <= 300) {
            totalBill = 100 * 1.50 + (unitsConsumed - 100) * 2.50;
        } else {
            totalBill = 100 * 1.50 + 200 * 2.50 + (unitsConsumed - 300) * 3.50;
        }
        
        System.out.println("Total bill: " + totalBill);

    }
}
