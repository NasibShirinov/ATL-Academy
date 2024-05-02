package lesson28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0, 5.5);
        Shape triangle = new Triangle(2.4, 5, 7.5);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle squad: " + rectangle.calculateSquad());
        System.out.println("Triangle squad: " + triangle.calculateSquad());
    }
}
