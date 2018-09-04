package chapter1.section1;

import java.util.Scanner;

public class EX03 {
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
