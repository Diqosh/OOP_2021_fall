package abstract_interface;

import java.util.Date;

abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCrated;

    protected GeometricObject() {
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCrated() {
        return dateCrated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCrated=" + dateCrated +
                '}';
    }

    abstract double getArea();

    abstract double getPerimeter();
}
