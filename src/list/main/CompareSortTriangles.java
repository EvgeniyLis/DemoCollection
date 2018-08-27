package list.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import list.model.Rectangle;
import list.model.Triangle;
import list.sort.ComparePerimDown;
import list.sort.ComparePerimUpTriangle;
import list.sort.CompareSquareDownTriangle;
import list.sort.CompareSquareUp;

public class CompareSortTriangles {

	public static void main(String[] args) throws FileNotFoundException {
		Triangle[] triangles;
		int count;
		FileReader fileReader=new FileReader("src/list/files/Triangles.txt");
		Scanner input=new Scanner(fileReader);
		count=input.nextInt();
		triangles=new Triangle[count];
		for (int i = 0; i < triangles.length; i++) {
			triangles[i]=new Triangle(input.nextInt(), input.nextInt(), input.nextInt());
		}
		System.out.println("Array before sorting is :");
		outArray(triangles);
		Arrays.sort(triangles, new ComparePerimUpTriangle());
		System.out.println("Array after sorting perim UP");
		outArray(triangles);
		Arrays.sort(triangles, new CompareSquareDownTriangle());
		System.out.println("Array after sorting square DOWN :");
		outArray(triangles);
	}
	
	public static void outArray(Triangle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
