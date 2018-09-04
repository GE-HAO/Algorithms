package chapter1.section1;

import java.util.Scanner;

public class EX23 {
	public static int rank(int key, int[] a, int lo, int hi, char flag) {
		if (lo > hi) {
			if (flag == '+') {
				System.out.println(key);
			}
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1, flag);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi, flag);
		else {
			if (flag == '-') {
				System.out.println(key);
			}
			return mid;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.close();
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
		rank(i, arr, 0, arr.length - 1, '+');
	}
}
