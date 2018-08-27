package collections.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapOutUsingEnteries {
	
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
		Set<Map.Entry<Integer, String>> entries=names.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}
	}

}
