package ua.homework1.www;

import ua.homework1.www.InputDataLoader.InputConfig;

/**
 * Created by nshkarupa on 28.07.2015.
 */
public  class InputLogicController {

    public static InputConfig getInputConfigFor(String inputItem, String prevInputItem, String nextInputItem) {
        // if value is double
        if (inputItem.matches("\\d+(\\.\\d+)?")) {
            double num = Double.valueOf(inputItem);
            // System.out.println(num);

            if (num % 2 == 0 && num % 3 == 0) {
                double nextnum = nextInputItem != null ? Double.valueOf(nextInputItem) : 0;
                double prevnum = prevInputItem != null ? Double.valueOf(prevInputItem) : 0;
                double radius = (nextnum + prevnum) / 2.0;

                return new InputConfig(0d, 0d, 0d, radius, EColors.RED, EFigures.CIRCLE);

            } else if (num % 2 == 0) {
                return new InputConfig(0d, 0d, num / 2, 0d, EColors.BLACK, EFigures.TRIANGLE);
            } else if (num % 3 == 0) {
                return new InputConfig(num / 2.5, 0d, 0d, 0d, EColors.WHITE, EFigures.SQUARE);
            }
            System.err.printf("The number %.2f doesn`t fit any rules!!!\n", num);
        }
        return null;
    }
}

