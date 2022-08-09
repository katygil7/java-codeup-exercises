package shapes;

import java.lang.Math;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getCircumference(){
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
}
