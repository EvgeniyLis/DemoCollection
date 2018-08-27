package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncRemove {

	//дана, коллекция, убрать все отрицательные числа
	
	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = numbers.size()-1 ; i >= 0 ; i--) {
			if (numbers.get(i)<0) {
				numbers.remove(i);	
			}
		}
		System.out.println();
		System.out.println("Collection afrer removing is:");
		outCollection(numbers);
	}
	public static void outCollection(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+"  ");
		}
	}
}
