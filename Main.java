
interface Shape {
    double calculateArea();
}


class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(4, 6);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
