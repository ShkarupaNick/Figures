package ua.homework1.www;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import ua.homework1.www.IFigure.Colors;

public class Main {
	public static String[] loadInputData(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));

		StringBuilder builder = new StringBuilder();
		String line = br.readLine();

		while (line != null && !line.equals("")) {
			builder.append(line);
			builder.append(System.lineSeparator());
			line = br.readLine();
		}
		String text = builder.toString();
		String str[] = text.replaceAll("\n|\r\n", "").split(";");
		System.out.println(Arrays.toString(str));
		createFigures(str);
		br.close();
		return str;
	}

	public static void exportData(String path) throws FileNotFoundException {
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter(path, true)))) {			
			int i = 1;
			StringBuilder outStr = new StringBuilder("{");
			for (AbstractFigure f : list) {
				outStr.append(String.format("%s%s={%s}%s\n", f.getName(), i++, f, i<list.size()?",":"}"));
				
			}
			out.println("\n\n"+new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date())+"\n-----------------------------------------------------------------------------------------------\n");
			out.println(outStr);
			out.close();

		} catch (IOException e) {
			 System.err.println("Caught IOException: " + e.getMessage());
		}
		
		
	}

	public static List<AbstractFigure> createFigures(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("\\d+(\\.\\d+)?")) {
				double num = Double.valueOf(str[i]);
				// System.out.println(num);
				 
				if (num % 2 == 0 && num % 3 == 0) {
						double nextnum = i < str.length-1 ? Double
								.valueOf(str[i + 1]) : 0;
						double prevnum = i > 0 ? Double.valueOf(str[i - 1]) : 0;
						double radius = (nextnum + prevnum) / 2;
						Circle c = new Circle(radius, Colors.RED);
						list.add(c);
					} else

				if (num % 2 == 0) {
					Triangle tr = new Triangle();
					tr.setC(num / 2);
					tr.setColor(Colors.BLACK);
					list.add(tr);

				}

				else if (num % 3 == 0) {
					Square sq = new Square(num / 2.5, Colors.WHITE);
					list.add(sq);
				}
				
				else{
					 System.err.printf("The number %.2f doesn`t fit any rules!!!\n", num);
				}

				
			}
		}

		return list;
	}

	static List<AbstractFigure> list = new ArrayList<AbstractFigure>();

	public static void main(String[] args) throws IOException {
		loadInputData("InputData.txt");
		exportData("output.txt");
	}

}
