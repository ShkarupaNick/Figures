package ua.homework1.www;

import ua.homework1.www.InputDataLoader.InputConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<AbstractFigure> list = new ArrayList<AbstractFigure>();

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        InputDataLoader input = new InputDataLoader("InputData.txt");
        List<InputConfig> inputConfigs =  input.getConfigList();

        FiguresFabric fabric = new FiguresFabric();
        for(InputConfig conf: inputConfigs){
           list.add(fabric.getInstance(conf));
        }

        OutputDataLoader out = new OutputDataLoader();
        out.exportData(list, "OutputData.txt", false);
    }
}
