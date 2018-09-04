package chapter1.section1;

import java.util.Scanner;

public class EX21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		scanner.close();
		String[] arr1 = a.split(",");
		String[] arr2 = b.split(",");
		String[] arr3 = c.split(",");
		System.out.printf("%-10s%-10d%-10d%-10.3f\n", arr1[0], Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2]), Float.parseFloat(arr1[1]) / Float.parseFloat(arr1[2]));
		System.out.printf("%-10s%-10d%-10d%-10.3f\n", arr2[0], Integer.parseInt(arr2[1]), Integer.parseInt(arr2[2]), Float.parseFloat(arr2[1]) / Float.parseFloat(arr2[2]));
		System.out.printf("%-10s%-10d%-10d%-10.3f\n", arr3[0], Integer.parseInt(arr3[1]), Integer.parseInt(arr3[2]), Float.parseFloat(arr3[1]) / Float.parseFloat(arr3[2]));
	}
}
