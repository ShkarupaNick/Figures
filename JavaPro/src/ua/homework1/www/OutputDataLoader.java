package ua.homework1.www;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by nshkarupa on 28.07.2015.
 */
public class OutputDataLoader {

    public static void exportData(List<AbstractFigure> list, String path, boolean isSerialize) throws IOException {

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(
                    new FileWriter(path, true)));
            int i = 1;
            StringBuilder outStr = new StringBuilder("{");
            for (AbstractFigure f : list) {
                outStr.append(String.format("%s%s={%s}%s\n", f.getName(), i++, f, i <= list.size() ? "," : "}"));
            }
            if (!isSerialize) {
                out.println("\n\n"
                        + new SimpleDateFormat("yyyy-mm-dd hh:mm:ss")
                        .format(new Date())
                        + "\n-----------------------------------------------------------------------------------------------\n");
                out.println(outStr);
                out.close();
            } else {
                File f = new File(path);
                ObjectOutputStream prstream = new ObjectOutputStream(new FileOutputStream(f));
                prstream.writeObject(list);
                prstream.close();
            }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }


}
