package in.shriya.Geometry;

public class Circle extends Shapes{
private final double radius ;
public Circle(double radius){
    this.radius=radius;
}
public double getradius(){
    return radius;
}
@Override
public double calculateArea(){
    return Math.PI*Math.pow(radius,2);
}
}
