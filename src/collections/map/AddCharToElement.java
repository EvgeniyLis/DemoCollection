package collections.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddCharToElement {
	
	//выделить имена, имеющие четные ключи в коллекции, и добавить им символ +

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
		outMap(names);
		Set<Integer> keys=names.keySet();
		for (Integer key : keys) {
			if (key%2==0) {
				String selectName=names.get(key)+" !"; //взять старое имя по ключу и добавили к нему символ, занесли в новую переменную
				names.put(key, selectName);
			}
		}
		System.out.println("Names after changing :");
		outMap(names);
	}
	
	public static void outMap(Map<Integer, String> names) {
		Set<Integer> keys=names.keySet(); 
		for (Integer key : keys) {
			System.out.println(key+". "+names.get(key));
		}
	}
}
