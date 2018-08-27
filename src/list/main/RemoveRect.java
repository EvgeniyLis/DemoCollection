package list.main;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import list.model.Rectangle;

public class RemoveRect {
	
	//дан набор прямоуг. в файле, удалить те, площади которого меньше указанного из консоли значения,
	//и вывести оставшиеся в другой файл

	public static void main(String[] args) throws IOException {
		List<Rectangle> rectangles=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Rectangles.txt");
		Scanner input=new Scanner(fileReader);
		double enterSquare=0;
		do {
			int a=input.nextInt();
			int b=input.nextInt();
			rectangles.add(new Rectangle(a, b));
		} while (input.hasNext()); //цикл чтения из файла, пока в нем есть данные
		System.out.println("Collection before deleting :");
		outArray(rectangles);
		System.out.println("Enter the square of rectangle");
		input=new Scanner(System.in);
		enterSquare=input.nextDouble();
		for (int i = 0; i < rectangles.size(); i++) {
			if (rectangles.get(i).getSquare()<enterSquare) {
				rectangles.remove(i--);
			}
		}
		System.out.println("File have been created");
		PrintWriter printWriter=new PrintWriter(new FileWriter("src/list/files/OutRectangles.txt"));
		for (int i = 0; i < rectangles.size(); i++) {
			printWriter.println(rectangles.get(i));
		}
		printWriter.close();
		input.close();
	}
	public static void outArray(List<Rectangle> rectangles) {
		for (int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}
	}
}
