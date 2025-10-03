package in.shriya.utils;

import in.shriya.geometry.Circle;
import in.shriya.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
         Circle cir=new Circle(0);
         Rectangle rec =new Rectangle(67, 90);

         double cirArea=Math.PI*Math.pow(cir.radius, 2);
         double recArea=rec.length*rec.breadth;
         System.out.printf("Area of Circle is %f, Area of Rectangle is %f",cirArea,recArea);
    }
 
}
