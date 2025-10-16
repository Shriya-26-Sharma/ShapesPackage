package in.shriya.Geometry;

public class Square extends Shapes{

private final double side;
public Square (double side){
    this.side=side;
}
public double getside(){
    return side;
}

@Override
public double calculateArea() {
  return side*side;
}
}
