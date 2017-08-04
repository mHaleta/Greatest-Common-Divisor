package nod;

import java.util.Scanner;

public class NOD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите целое число 'n', отличное от нуля: ");
		long n = in.nextLong();
		System.out.print("Введите целое число 'm', отличное от нуля: ");
		long m = in.nextLong();
		in.close();
		System.out.println("=======================================================");
		if(n>m)
			System.out.printf("Наибольший общий делитель этих двух чисел: %d", Algorithm.nod(n, m));
		else
			System.out.printf("Наибольший общий делитель этих двух чисел: %d", Algorithm.nod(m, n));
	}

}
