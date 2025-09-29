import java.util.*;
class Circle {

    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double circumference(){
    return 2*radius*Math.PI;
    }
    double areaOfCircle(){
    return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString() {
        final StringBuilder sb= new StringBuilder("Circle{}");
        sb.append("radius = ").append(radius);
        sb.append("}");
        return "Circle : Radius:"+radius+" Circumference :"+circumference()+" Area :"+areaOfCircle();
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Radius of a Circle");
    double radius =sc.nextDouble();
    Circle ob=new Circle(radius);
    System.out.println("Area of the Circle is : "+ob.areaOfCircle());
    System.out.println("Circumference of the Circle : "+ob.circumference());
    sc.close();    
    }
}
