package collections.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapInsert {
	
	//вывести в консоль коллекцию имен и порядковых номеров из файла

	public static void main(String[] args) throws FileNotFoundException {
		Map<Integer, String> names=new HashMap<>();
		FileReader fileReader=new FileReader("src/list/files/map.txt");
		Scanner input=new Scanner(fileReader);
		while (input.hasNext()) {
			Integer key=input.nextInt();
			String name=input.next();
			names.put(key, name);
		}
		System.out.println("Collection of names :");
		Set<Integer> keys=names.keySet(); //получение ключей исходной коллекции
		for (Integer key : keys) {
			System.out.println(key+". "+names.get(key));
		}
	}

}
