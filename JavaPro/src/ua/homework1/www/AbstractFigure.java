package ua.homework1.www;

import java.io.Serializable;

public abstract class AbstractFigure implements IFigure, Serializable, Cloneable {

    protected EFigures name;
    protected double square;
    protected double perimeter;
    protected EColors color;

    public AbstractFigure() {
    }

    public AbstractFigure(EFigures name, EColors color) {
        this.name = name;
        this.color = color;
    }

    public EColors getColor() {
        return color;
    }

    public void setColor(EColors color) {
        this.color = color;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public EFigures getName() {
        return name;
    }

    public void setName(EFigures name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "color=" + color
                + ", perimeter=" + (perimeter == 0.0 ? "N/A" : perimeter)
                + ", square= " + (square == 0.0 ? "N/A" : square);
    }

    @Override
    public AbstractFigure clone() throws CloneNotSupportedException {
        AbstractFigure c = (AbstractFigure) AbstractFigure.super.clone();
        // c.color = ((AbstractFigure) AbstractFigure.super.clone()).color;
        return c;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;

        AbstractFigure that = (AbstractFigure) o;

        if (Double.compare(that.square, square) != 0) return false;
        if (Double.compare(that.perimeter, perimeter) != 0) return false;
        if (name != that.name) return false;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(square);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    protected abstract void update();
}
