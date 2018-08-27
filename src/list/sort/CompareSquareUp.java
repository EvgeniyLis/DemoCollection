package list.sort;

import java.util.Comparator;

import list.model.Rectangle;

public class CompareSquareUp implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle rect1, Rectangle rect2) {
		return Integer.compare(rect1.getSquare(), rect2.getSquare());
	}

}
