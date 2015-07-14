package ua.homework1.www;

public abstract class AbstractFigure implements IFigure{	

	protected Figures name;
	protected double square;
	protected double perimeter;
	protected Colors color;

		public Colors getColor() {
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

	public void setColor(Colors color) {
		this.color = color;
	}
	
	public Figures getName() {
		return name;
	}

	public void setName(Figures name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "color=" + color 
				+ ", perimeter=" + (perimeter == 0.0 ? "N/A" : perimeter) 
				+ ", square= "	+ (square == 0.0 ? "N/A" : square);
	}	
	
	protected abstract  void update();
 
}
