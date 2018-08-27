package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncContainsCollection {
	
	//дана колл, в которой нужно избавиться от одинаковых, эл-тов и оставить только один оз них

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = numbers.size()-1; i >= 0; i--) {
			Integer element=numbers.get(i);
			numbers.remove(i);
			if (!numbers.contains(element)) {
				numbers.add(element);
			}
		}
		System.out.println();
		System.out.println("Collection after removing equal elements :");
		outCollection(numbers);
	}
	public static void outCollection(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+"  ");
		}
}
}