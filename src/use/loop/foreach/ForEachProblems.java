package use.loop.foreach;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ForEachProblems {
	
	//отрицательные эл-ты заменить положит. аналогами

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
		System.out.println("Source array :");
		outArray(array);
		/*for (int element : array) {
			if (element<0) {
				element=-element;
			}
		}*/
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0) {
				array[i]=-array[i];
			}
		}
		System.out.println();
		System.out.println("Array after changing :");
		outArray(array);
	}
	
	public static void outArray(int[] arr) {
	for (double element : arr) {
		System.out.print(element+" ");
	}


	}

}
