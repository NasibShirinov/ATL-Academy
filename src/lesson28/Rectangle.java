package lesson28;

import java.util.Objects;

public class Rectangle implements Shape{
    private double side1;
    private double side2;

    @Override
    public double calculateSquad() {
        double perimetr = (this.side1 * this.side2) * 2;
        return perimetr;
    }

    @Override
    public double calculatePerimeter() {
        double squad = (this.side1 * this.side2);
        return squad;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.side1, side1) == 0 && Double.compare(rectangle.side2, side2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2);
    }
}
