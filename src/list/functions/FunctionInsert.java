package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionInsert {
	
	//���� �������� ���������, ����� ������ �����. ������ �������� ��� �������. ������

	public static void main(String[] args) throws FileNotFoundException {
		List<Double> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextDouble());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i)<0) {
				numbers.add(i, -numbers.get(i)); // ������ add ��������� ����� ��-� �� ������� ����� ���, ���. ������� ��������
				i++; //�������� ������� ��-�� ������� ������ ��-�� � ���������
			}
		}
		System.out.println("Coll after conversion");
		outCollection(numbers);
	}

	public static void outCollection(List<Double> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
