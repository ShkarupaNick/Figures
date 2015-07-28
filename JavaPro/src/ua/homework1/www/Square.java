package ua.homework1.www;


public class Square extends AbstractFigure{

	private double a;

	public Square() {
		super(EFigures.SQUARE, EColors.TRANSPARENT);
	}

	public Square(EColors c) {
		super(EFigures.SQUARE, c);
	}

	public Square(double a, EColors color) {
		this();
		this.a = a;
		this.color = color;
		update();

	}


	public Square(double a) {
		this(a, EColors.TRANSPARENT);
	}

	@Override
	public String toString() {
		return  super.toString() + ", a=" + (a == 0.0 ? "N/A" : a);
	}

	@Override
	public void update() {
		if (a == 0.0) {
			System.err.println("Side length  is not specified!!!");
		} else {
			square = a * a;
			perimeter = 4 * a;
		}		
	}

	@Override
	public Square clone() throws CloneNotSupportedException {
		return  (Square)Square.super.clone();
	}

}
