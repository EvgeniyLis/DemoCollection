package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.w3c.dom.css.Rect;

public class RemoveRectanglesByConditions {

	//использую коллекцию HashMap ввести список прямоуг, и удалить из них те, у которых периметр больше плошади
	
	public static void main(String[] args) {
		Map<Integer, Rectangle> rectangles=new HashMap<>();
		int count;
		System.out.println("Enter the count of rectangles");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		int index=1;
		for (int i = 0; i < count; i++) {
			System.out.println("Enter sizes of "+(index++)+" rectangle");
			rectangles.put(i, new Rectangle(input.nextInt(), input.nextInt()));
		}
		System.out.println("Collection of rectangles :");
		Set<Integer> keys=rectangles.keySet();
		for (Integer key : keys) {
			System.out.println(key+". "+rectangles.get(key));
		}
		
		for (Integer key : keys) {
			Rectangle rectangle=rectangles.get(key);
			if (rectangle.getPerim()>rectangle.getSquare()) {
				rectangles.remove(key);
			}
		}
		System.out.println("Collection after removing:");
		Set<Integer> keys1=rectangles.keySet();
		for (Integer key : keys1) {
			System.out.println(key+". "+rectangles.get(key));
		}
	}

}
