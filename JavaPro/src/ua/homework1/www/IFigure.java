package ua.homework1.www;


public interface IFigure {
	
	public enum Figures {
		TRIANGLE, CIRCLE, SQUARE;
	}

	public enum Colors {
		TRANSPARENT, WHITE, BLUE, BLACK, GREY, RED, GREEN, PURPLE, LIGHTBLUE, ORANGE;
	}
	
	public double getSquare();
	public double getPerimeter();
	public void setColor(Colors color);
	public Colors getColor();

}
