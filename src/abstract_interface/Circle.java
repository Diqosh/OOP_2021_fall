package abstract_interface;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){}


    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super.setColor(color);
        super.setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return  3.14 * radius * radius;
    }
    @Override
    double getPerimeter() {
        return  2 * 3.14 * radius;
    }
}
