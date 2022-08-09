package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("type the radius for a circle");
        double userR = input.getDouble();
        Circle circle = new Circle(userR);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
