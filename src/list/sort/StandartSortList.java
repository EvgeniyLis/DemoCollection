package list.sort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import list.model.Rectangle;

public class StandartSortList {

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
		for (int border = 0; border < rectangles.size()-1; border++) {
			for (int i = 0; i < rectangles.size()-border-1; i++) {
				if (rectangles.get(i).getSquare()>rectangles.get(i+1).getSquare()) {
					temp=rectangles.get(i);
					rectangles.set(i, rectangles.get(i+1));
					rectangles.set(i+1, temp);
					
				}
			}
		}
		for (int border = 0; border < rectangles.size()-1; border++) {
			for (int i = 0; i < rectangles.size()-border-1; i++) {
				if (rectangles.get(i).getPerim()<rectangles.get(i+1).getPerim()) {
					temp=rectangles.get(i);
					rectangles.set(i, rectangles.get(i+1));
					rectangles.set(i+1, temp);
					
				}
			}
		}
		
	}
	public static void outArray(List<Rectangle> rectangles) {
		for (int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}
	}
}
