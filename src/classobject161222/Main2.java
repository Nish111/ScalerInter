package classobject161222;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix a = new Matrix(10, 5);  // 10 rows, 5 columns
		a.input(sc);
		Matrix b = new Matrix(10, 5);  // 10 rows, 5 columns
		b.input(sc);
		Matrix c1 = a.add(b);
		Matrix c2 = a.subtract(b);
		Matrix c3 = a.transpose();
		a.print();
		System.out.println("HH");
	}
}
