package list.sort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import list.model.Rectangle;

public class CompareSortList {

	//ввести коллекцию прямоуг иотсортировать в порядке возрастания площади и убывания периметра
	
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
		System.out.println("Array before sorting is :");
		outArray(rectangles);
		Collections.sort(rectangles, new CompareSquareUp());
		System.out.println("Collection after sorting square UP :");
		outArray(rectangles);
		Collections.sort(rectangles, new ComparePerimDown());
		System.out.println();
		System.out.println("Collection after sorting perim DOWN :");
		outArray(rectangles);
	}
	public static void outArray(List<Rectangle> rectangles) {
		for (int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}
	}
}
