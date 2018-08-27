package override.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		
		Map<KeyHuman, Human> humans = new HashMap<>();
		
		Human h1 = new Human("Ivan", 21, 350);
		Human h2 = new Human("Evgen", 32, 500);
		Human h3 = new Human("Ivan", 21, 350);
		
		KeyHuman kH1 = new KeyHuman("one", "two", "three");
		KeyHuman kH2 = new KeyHuman("two", "three", "four");
		KeyHuman kH3 = new KeyHuman("one", "two", "three");
		
		humans.put(kH1, h1);
		humans.put(kH2, h2);
		humans.put(kH3, h3);
		
		Set<Map.Entry<KeyHuman, Human>> entries=humans.entrySet();
		for (Map.Entry<KeyHuman, Human> entry : entries) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
