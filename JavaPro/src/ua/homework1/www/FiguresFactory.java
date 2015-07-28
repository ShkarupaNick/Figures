package ua.homework1.www;

import ua.homework1.www.InputDataLoader.InputConfig;

/**
 * Created by nshkarupa on 28.07.2015.
 */
public class FiguresFactory {
    public AbstractFigure getInstance(InputConfig inputConfig) {
        switch (inputConfig.getFigure()) {
            case CIRCLE:
                return new Circle(inputConfig.getRadius(), inputConfig.getColor());

            case SQUARE:
                return new Square(inputConfig.getA(), inputConfig.getColor());

            case TRIANGLE:
                return new Triangle(inputConfig.getA(), inputConfig.getB(), inputConfig.getC(), inputConfig.getColor());

            default:
                return null;
        }
    }
}
