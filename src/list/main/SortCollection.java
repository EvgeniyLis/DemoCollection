package list.main;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import list.model.Rectangle;

public class SortCollection {
	
	// тсортировать коллекцию прямоуг. по возрастанию площадей и убыванию периметров

	public static void main(String[] args) throws IOException {
		java.util.List<Rectangle> rectangles=new ArrayList<>();
		Rectangle temp;
		FileReader fileReader=new FileReader("src/list/files/Rectangles.txt");
		Scanner input=new Scanner(fileReader);
		do {
			int a=input.nextInt();
			int b=input.nextInt();
			rectangles.add(new Rectangle(a, b));
		} while (input.hasNext());
		System.out.println("Collection before sorting is :");
		outCollection(rectangles);
		for (int border = 0; border < rectangles.size()-1; border++) {
			for (int i = 0; i < rectangles.size()-border-1; i++) {
				if (rectangles.get(i).getSquare()>rectangles.get(i+1).getSquare()) {
					temp=rectangles.get(i);
					rectangles.set(i, rectangles.get(i+1));
					rectangles.set(i+1, temp);
				}
			}
		}
		PrintWriter printWriterUp=new PrintWriter(new FileWriter("src/list/files/CollSortSquareUp.txt"));
		for (int i = 0; i < rectangles.size(); i++) {
			printWriterUp.println(rectangles.get(i));
		}
		printWriterUp.close();
		for (int border = 0; border < rectangles.size()-1; border++) {
			for (int i = 0; i < rectangles.size()-border-1; i++) {
				if (rectangles.get(i).getPerim()<rectangles.get(i+1).getPerim()) {
					temp=rectangles.get(i);
					rectangles.set(i, rectangles.get(i+1));
					rectangles.set(i+1, temp);
				}
			}
		}
		PrintWriter printWriterDown=new PrintWriter(new FileWriter("src/list/files/CollSortPerimDown.txt"));
		for (int i = 0; i < rectangles.size(); i++) {
			printWriterDown.println(rectangles.get(i));
		}
		printWriterDown.close();
		input.close();
		System.out.println("Files have been created");
	}
	public static void outCollection(java.util.List<Rectangle> rect) {
		for (int i = 0; i < rect.size(); i++) {
			System.out.println(rect.get(i));
		}
	}

}
