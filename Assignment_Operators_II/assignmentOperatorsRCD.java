package Assignment_Operators_II;

public class assignmentOperatorsRCD {
    public static void main(String[] args){
        int x = 10;

        x += 5;
        System.out.println(x);

        x -= 3;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 4;
        System.out.println(x);

        x %= 3;
        System.out.println(x);

        int initialPrice = 100;

        System.out.println("Price : " + initialPrice);

        initialPrice *= .80; // discount 20%
        initialPrice *= 1.1; // tax 10%
        int finalPrice = initialPrice;

        System.out.println("Total price after discount and tax: " + finalPrice);
    }
}
