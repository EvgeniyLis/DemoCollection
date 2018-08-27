package list.sort;

import java.util.Comparator;

import list.model.Rectangle;

public class ComparePerimDown implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle rect2, Rectangle rect1) { //���� ���������� �� �������� - ������� ������ ���������� ������ ������������
		return Integer.compare(rect1.getPerim(), rect2.getPerim());
	}

}
