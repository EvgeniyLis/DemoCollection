package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncFindElement {
	
	//дана коллекция, заменить все пятерки нулями

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		while (numbers.indexOf(5)!=-1) { //пока внутри коллекции есть элемент, равный пятерке
			numbers.set(numbers.indexOf(5), 0);
		}
		System.out.println();
		System.out.println("Collection after changing :");
		outCollection(numbers);
	}
	public static void outCollection(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+"  ");
		}
	}
}
