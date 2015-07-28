package ua.homework1.www;

public class Circle extends AbstractFigure {

    private double radius;
    private double diameter;

    public Circle() {
        super(EFigures.CIRCLE,EColors.TRANSPARENT);
        }

    public Circle(EColors c) {
        super(EFigures.CIRCLE, c);
    }

    public Circle(double radius, EColors color) {
        this.name =EFigures.CIRCLE;
        this.radius = radius;
        this.color = color;
        update();
    }

    public Circle(double radius) {
        this(radius, EColors.TRANSPARENT);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        update();
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        update();
    }


    @Override
    public String toString() {
        return super.toString()
                + ", radius=" + radius
                + ", diameter=" + diameter;
    }


    public void update() {
        if (radius == 0.0) {
            System.err.println("Radius  is not specified!!!");
        } else {
            perimeter = 2 * Math.PI * radius;
            diameter = radius * 2;
            square = Math.PI * Math.pow(radius, 2.0);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return Double.compare(circle.diameter, diameter) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle c = (Circle) Circle.super.clone();
        return c;
    }
}
