package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindElementHomew {
	
	//числа 3, 5, 7 в коллекции удвоить

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i)==5 | numbers.get(i)==3 | numbers.get(i)==7) {
				numbers.set(i, numbers.get(i)*2) ;
			}
		}
		System.out.println();
		System.out.println("Collection after changing :");
		outCollection(numbers);
	}
	public static void outCollection(List<Integer> numbers) {
		for (Integer element : numbers) {
			System.out.print(element+" ");
		}
	}
}
