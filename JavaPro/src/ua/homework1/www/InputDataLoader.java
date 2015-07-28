package ua.homework1.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nshkarupa on 28.07.2015.
 */
public class InputDataLoader {
    private final List<InputConfig> configList = new ArrayList<InputConfig>();

    public InputDataLoader(String path) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(path));

        StringBuilder builder = new StringBuilder();
        String line = br.readLine();

        while (line != null && !line.equals("")) {
            builder.append(line);
            builder.append(System.lineSeparator());
            line = br.readLine();
        }

        String text = builder.toString();
        String[] str;
        str = text.replaceAll("\n|\r\n", "").split(";");
        System.out.println(Arrays.toString(str));
        br.close();

        for (int i = 0; i < str.length; i++) {
            InputConfig config = InputLogicController.getInputConfigFor(str[i], i == 0 ? null : str[i - 1], i == str.length-1 ? null : str[i + 1]);
           if(config!=null)
            {
                configList.add(config);
            }
        }
    }

    public List<InputConfig> getConfigList() {
        return configList;
    }

    static class InputConfig {

        private double a;
        private double b;
        private double c;
        private double radius;
        private EColors color;
        private EFigures figure;
        public InputConfig(double a, double b, double c, double radius, EColors color, EFigures figure) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.radius = radius;
            this.color = color;
            this.figure = figure;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public EColors getColor() {
            return color;
        }

        public EFigures getFigure() {
            return figure;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getA() {
            return a;
        }

    }
}


