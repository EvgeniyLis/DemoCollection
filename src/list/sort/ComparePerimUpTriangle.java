package list.sort;

import java.util.Comparator;

import list.model.Rectangle;
import list.model.Triangle;

public class ComparePerimUpTriangle implements Comparator<Triangle> {

	@Override
	public int compare(Triangle triag1, Triangle triag2) { //���� ���������� �� �������� - ������� ������ ���������� ������ ������������
		return Integer.compare(triag1.getPerim(), triag2.getPerim());
	}

}
