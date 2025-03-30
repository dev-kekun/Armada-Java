class Car {

    String brand;
    int year;

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class carOOP {
    public static void main(String[] args){

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2020;

        car1.displayInfo();
    }
}
