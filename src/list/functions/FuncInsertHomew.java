package list.functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncInsertHomew {
	
	//���� �������� ���������, ����� ������ ���� ������ �������� ��� ��������

	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> numbers=new ArrayList<>();
		FileReader fileReader=new FileReader("src/list/files/Collection2.txt");
		Scanner input=new Scanner(fileReader);
		do {
			numbers.add(input.nextInt());
		} while (input.hasNext());
		System.out.println("Source collection :");
		outCollection(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i)%2==0) {
				numbers.add(i, numbers.get(i)/2);
				i++;
			}
		}
		System.out.println();
		System.out.println("Collection after changini is :");
		outCollection(numbers);
	}
	public static void outCollection(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+" , ");
		}
	}
}
