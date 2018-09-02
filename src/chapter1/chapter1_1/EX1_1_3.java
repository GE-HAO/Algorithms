package chapter1.chapter1_1;

import java.util.Scanner;

public class EX1_1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		if (a == b && a == c) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
