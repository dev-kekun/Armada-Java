package Assignment_Operators_I;

public class modulusOperatorRCD {
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 3;
        int myNumber = 10;

        if(myNumber % num1 == 0){
            System.out.println(myNumber + " is divisible by " + num1 );
        }else{
            System.out.println(myNumber + " is Not divisible by " + num2);
        }
    }
}
