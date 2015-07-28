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

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		if (this == o) return true;
		if (!super.equals(o)) return false;

		Square square = (Square) o;

		return Double.compare(square.a, a) == 0;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(a);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
