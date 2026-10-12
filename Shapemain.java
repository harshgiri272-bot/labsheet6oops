public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 7),
            new Rectangle("Rectangle", 10, 5)
        };
        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}
class Shape {
    protected String name;
    Shape(String name) { this.name = name; }
    void displayShapeName() { System.out.println("Shape: " + name); }
}
class Circle extends Shape {
    private double radius;
    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    double calculateArea() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    private double length, width;
    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    double calculateArea() { return length * width; }
}
class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();
            if (shapes[i] instanceof Circle)
                System.out.println("Area: " + ((Circle) shapes[i]).calculateArea());
            else if (shapes[i] instanceof Rectangle)
                System.out.println("Area: " + ((Rectangle) shapes[i]).calculateArea());
        }
    }
}
