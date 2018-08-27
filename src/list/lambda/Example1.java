package list.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	
	//дана коллекция, вывести её максимально простым кодом

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(-3);
		numbers.add(54);
		numbers.add(-4);
		System.out.println("Output collection by loop FOR");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("Output collection by loop FOREACH");
		for (Integer elem : numbers) {
			System.out.println(elem);
		}
		System.out.println("Output collection by loop LAMBDA standart");
		numbers.forEach((Integer elem)->{System.out.println(elem);});
		System.out.println("Output collection by loop LAMBDA short");
		numbers.forEach(elem->{System.out.println(elem);});
		System.out.println("Output collection by loop LAMBDA shortest");
		numbers.forEach(System.out::println);
	}

}
