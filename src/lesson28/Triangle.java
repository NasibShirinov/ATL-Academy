package lesson28;

import java.util.Objects;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    @Override
    public double calculateSquad() {
        double perimetr = this.side1 + this.side2 + this.side3;
        return perimetr;
    }

    @Override
    public double calculatePerimeter() {
        double squad = (this.side1 + this.side2 + this.side3) / 2;
        return squad;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }
}
