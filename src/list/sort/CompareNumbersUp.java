package list.sort;

import java.util.Comparator;

public class CompareNumbersUp implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		return Integer.compare(num1, num2);
	}

}
