package use.loop.foreach;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ArrayForEach {
	
	//ввести массив из файла и вывести его про помощи цикла foreach

	public static void main(String[] args) throws FileNotFoundException {
		int[] array;
		int count=0;
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		count=input.nextInt();
		array=new int[count];
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		outArray(array);
	}
	
	public static void outArray(int[] arr) {
	for (double element : arr) {
		System.out.print(element+" ");
	}
}
}
