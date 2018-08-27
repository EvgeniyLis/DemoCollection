package list.sort;

import java.util.Comparator;

import list.model.Rectangle;
import list.model.Triangle;

public class CompareSquareDownTriangle implements Comparator<Triangle> {

	@Override
	public int compare(Triangle triag1, Triangle triag2) {
		return Double.compare(triag2.getSquare(), triag1.getSquare());
	}


}
