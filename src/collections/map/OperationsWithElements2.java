package collections.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OperationsWithElements2 {
	
	//Ёлементы, имеющие четные ключи, кратные 3 - разделить на 3, кратные 7 - разделить на 5

	public static void main(String[] args) throws FileNotFoundException {
		Map<Integer, Double> numbers=new HashMap<>();
		FileReader fileReader=new FileReader("src/list/files/map1.txt");
		Scanner input=new Scanner(fileReader);
		while (input.hasNext()) {
			Integer key=input.nextInt();
			Double name=input.nextDouble();
			numbers.put(key, name);
		}
		System.out.println("Collection of numbers :");
		outMap(numbers);
		
		Set<Integer> keys=numbers.keySet();
		for (Integer key : keys) {
			if (key%3==0) {
				Double doublingNumber=numbers.get(key)/3; 
				numbers.put(key, doublingNumber);
			}
			if (key%7==0) {
				Double tripleNumber=numbers.get(key)/5;
				numbers.put(key, tripleNumber);
			}
		}
		System.out.println("Numbers after changing :");
		outMap(numbers);
	}
	
	public static void outMap(Map<Integer, Double> numbers) {
		Set<Map.Entry<Integer, Double>> entries=numbers.entrySet();
		for (Map.Entry<Integer, Double> entry : entries) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}
	}
}
