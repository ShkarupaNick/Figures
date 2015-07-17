package ua.homework1.www;


public class Square extends AbstractFigure{

	private double a;

	public Square() {
		this.name = Figures.SQUARE;
	}

	public Square(double a, Colors color) {
		this.name = Figures.SQUARE;
		this.a = a;
		this.color = color;
		update();
	}
	
	public Square(double a) {
		this(a, null);
	}

	
	
	@Override
	public String toString() {
		return  super.toString() + ", a=" + (a == 0.0 ? "N/A" : a);
	}

	@Override
	protected void update() {
		if (a == 0.0) {
			System.err.println("Side length  is not specified!!!");
		} else {
			square = a * a;
			perimeter = 4*a;
		}		
	}

	@Override
	public Square clone() throws CloneNotSupportedException {
		return  (Square)Square.super.clone();
	}

}
