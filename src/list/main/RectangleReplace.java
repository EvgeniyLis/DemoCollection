package list.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import list.model.Rectangle;

public class RectangleReplace {
	
	//дана коллекция прямоуг, найти прямоуг. с мин и макс периметром и поменять их местами

	public static void main(String[] args) throws FileNotFoundException {
		List<Rectangle> rectangles=new ArrayList<>();
		Rectangle temp;
		FileReader fileReader=new FileReader("src/list/files/Rectangles.txt");
		Scanner input=new Scanner(fileReader);
		do {
			int a=input.nextInt();
			int b=input.nextInt();
			rectangles.add(new Rectangle(a, b));
		} while (input.hasNext());
		int minPosPerim=0;
		int maxPosPerim=0;
		for (int i = 1; i < rectangles.size(); i++) {
			if (rectangles.get(i).getPerim()<rectangles.get(minPosPerim).getPerim()) {
				minPosPerim=i;
			}
			if (rectangles.get(i).getPerim()>rectangles.get(maxPosPerim).getPerim()) {
				maxPosPerim=i;
			}
		}
		System.out.println("List before replacing is :");
		outArray(rectangles);
		temp=rectangles.get(minPosPerim);
		rectangles.set(minPosPerim, rectangles.get(maxPosPerim));
		rectangles.set(maxPosPerim, temp);
		System.out.println("List after replacing is :");
		outArray(rectangles);
	}
	public static void outArray(List<Rectangle> rectangles) {
		for (int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}
	}
}
