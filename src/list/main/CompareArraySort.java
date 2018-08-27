package list.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import list.model.Rectangle;
import list.sort.ComparePerimDown;
import list.sort.CompareSquareUp;

public class CompareArraySort {

	public static void main(String[] args) throws FileNotFoundException {
		Rectangle[] rectangles;
		int count;
		FileReader fileReader=new FileReader("src/list/files/Rectangles.txt");
		Scanner input=new Scanner(fileReader);
		count=input.nextInt();
		rectangles=new Rectangle[count];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i]=new Rectangle(input.nextInt(), input.nextInt());
		}
		System.out.println("Array before sorting is :");
		outArray(rectangles);
		Arrays.sort(rectangles, new CompareSquareUp());
		System.out.println("Array after sorting square UP");
		outArray(rectangles);
		Arrays.sort(rectangles, new ComparePerimDown());
		System.out.println("Array after sorting perim DOWN :");
		outArray(rectangles);
	}
	
	public static void outArray(Rectangle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
