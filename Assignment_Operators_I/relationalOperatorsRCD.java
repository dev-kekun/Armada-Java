package Assignment_Operators_I;

public class relationalOperatorsRCD {
    public static void main(String[] args){
        
        int x = 20;
        int y = 30;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        if(x >= 10 && x <= 50){
            System.out.println("x is within the range");
        }else{
            System.out.println("x is NOT within the range");
        }
    }
}
