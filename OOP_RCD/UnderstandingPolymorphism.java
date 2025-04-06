interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class UnderstandingPolymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Radius = 5
        Shape rectangle = new Rectangle(10, 5); // Length = 10, Width = 5

        System.out.println("Area of Circle: " + circle.area()); // Expected: 78.53975
        System.out.println("Area of Rectangle: " + rectangle.area()); // Expected: 50
    }
}
