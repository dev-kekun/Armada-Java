package Assignment_Operators_II;

public class logicalOperatorsRCD {
    public static void main(String[] args){

        boolean a = true;
        boolean b = false;

        
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);


        int creditScore = 710;
        int annualIncome = 55000;

        if(creditScore > 700 && annualIncome > 50000){
            System.out.println("Congratulations! you are eligible to apply for loan!");
        }else{
            System.out.println("Sorry, you did not meet the requirements for the loan.");
        }


    }
}
