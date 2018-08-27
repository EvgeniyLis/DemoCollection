package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncRemoveSeveralElements {
	
	//дано две коллекции, из первой убрать эл-ты, которые есть в обеих коллекциях

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers1=new ArrayList<>();
		List<Integer> numbers2=new ArrayList<>();
		FileReader fileReader1=new FileReader("src/list/files/Collection2.txt");
		FileReader fileReader2=new FileReader("src/list/files/Collection3.txt");
		Scanner input1=new Scanner(fileReader1);
		Scanner input2=new Scanner(fileReader2);
		do {
			numbers1.add(input1.nextInt());
		} while (input1.hasNext());
		do {
			numbers2.add(input2.nextInt());
		} while (input2.hasNext());
		System.out.println("First collection before changing :");
		outCollection(numbers1);
		System.out.println();
		System.out.println("Second collection before changing :");
		outCollection(numbers2);
		numbers1.removeAll(numbers2); // "вычесть" из первой коллекции вторую (одинаковые эл-ты)
		System.out.println();
		System.out.println("First collection after changing :");
		outCollection(numbers1);
		System.out.println();
		System.out.println("Second collection after changing :");
		outCollection(numbers2);
	}

	public static void outCollection(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+"  ");
		}
	}
}
