package override.hashcode;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set<Human> humans = new HashSet<Human>();
		Human h1 = new Human("Ivan", 21, 350);
		Human h2 = new Human("Evgen", 32, 500);
		Human h3 = new Human("Ivan", 21, 350);
		
		humans.add(h1);
		humans.add(h2);
		humans.add(h3);
		
		System.out.println("Object h1 equals to object h3 returns "+h1.equals(h3));
		
		for (Human human : humans) {
			System.out.println(human + " " + human.hashCode());
		}
		
	}

}
