package ua.homework1.www;

public class Circle extends AbstractFigure {

    private double radius;
    private double diameter;

    public Circle() {
        super(Figures.CIRCLE,Colors.TRANSPARENT);
        }

    public Circle(double radius, Colors color) {
        this.name =Figures.CIRCLE;
        this.radius = radius;
        this.color = color;
        update();
    }

    public Circle(double radius) {
        this(radius, Colors.TRANSPARENT);
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
    public Circle clone() throws CloneNotSupportedException {
        Circle c = (Circle) Circle.super.clone();
        return c;
    }
}
