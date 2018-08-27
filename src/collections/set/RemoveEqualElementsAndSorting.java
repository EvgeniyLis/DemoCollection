package collections.set;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import list.sort.CompareNumbersUp;

public class RemoveEqualElementsAndSorting {

	//убрать из колл одинак эл-ты и результирующую коллекцию отсортировать
	
	public static void main(String[] args) throws FileNotFoundException {
		Set<Integer> numbersAfterRemoving=new TreeSet<>(new CompareNumbersUp());
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			numbersAfterRemoving.add(numbers.get(i));
		}
		System.out.println("\nCollection after removing :");
		for (Integer num : numbersAfterRemoving) {
			System.out.print(num+" ");
		}
		
	}
	public static void outCollection(List<Integer> numbers) {
		for (Integer element : numbers) {
			System.out.print(element +"  ");
		}
}
}