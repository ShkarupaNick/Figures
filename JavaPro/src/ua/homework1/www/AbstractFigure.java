package ua.homework1.www;

import java.io.Serializable;

public abstract class AbstractFigure implements IFigure, Serializable, Cloneable{

    protected EFigures name;
    protected double square;
    protected double perimeter;
    protected EColors color;

    public AbstractFigure(){
    }

    public AbstractFigure(EFigures name, EColors color){
            this.name = name;
            this.color = color;
    }

    public EColors getColor() {
        return color;
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

    public void setColor(EColors color) {
        this.color = color;
    }

    public EFigures getName() {
        return name;
    }

    public void setName(EFigures name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return    "color=" + color
                + ", perimeter=" + (perimeter == 0.0 ? "N/A" : perimeter)
                + ", square= " + (square == 0.0 ? "N/A" : square);
    }
    @Override
    public AbstractFigure clone() throws CloneNotSupportedException {
        AbstractFigure c = (AbstractFigure) AbstractFigure.super.clone();
       // c.color = ((AbstractFigure) AbstractFigure.super.clone()).color;
        return c;
    }
    protected abstract void update();
}
