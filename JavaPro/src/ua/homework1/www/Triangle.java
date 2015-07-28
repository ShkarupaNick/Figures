package ua.homework1.www;

public class Triangle extends AbstractFigure {

	private double a;
	private double b;
	private double c;

	public Triangle() {
		super(EFigures.TRIANGLE,EColors.TRANSPARENT);
	}

	public Triangle(EColors c) {
		super(EFigures.TRIANGLE, c);
	}

	public Triangle(double a, double b, double c, EColors color) {
		this.name = EFigures.TRIANGLE;
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
		update();
	}

	public Triangle(double a, double b, double c) {
		this(a, b, c, EColors.TRANSPARENT);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
		update();
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
		update();
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
		update();
	}

	public void update() {
		if (perimeter == 0.0) {
			if (a == 0.0 | b == 0.0 | c == 0.0) {
				System.err.println("Some side length  is not specified!!! The program will use default values!!");
				a=c/2.0;
				b=c/3.0;
			}
				perimeter = a + b + c;
				square = Math.pow((perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c)),0.5);
		}		
	}

	@Override
	public String toString() {
		return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
	}

	@Override
	public Triangle clone() throws CloneNotSupportedException {
		Triangle c = (Triangle) Triangle.super.clone();
		return c;
	}
}
