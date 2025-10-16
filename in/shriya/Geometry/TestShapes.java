package in.shriya.Geometry;

public class TestShapes {
public static void main(String[] args) {
    // [cuz this isabstract] Shapes shape=new Shapes();
    Circle circle =new Circle(8);
    Square sq=new Square(8);
    System.out.println("Area of a circle:"+circle.calculateArea());
    System.out.println("Area of a Square:"+sq.calculateArea());
}
}
