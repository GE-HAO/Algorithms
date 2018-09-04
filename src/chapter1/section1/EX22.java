package chapter1.section1;

public class EX22 {
	public static int rank(int key, int[] a, int lo, int hi, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print(" ");
		}
		System.out.println("lo=" + lo + " hi=" + hi);
		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1, ++level);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi, ++level);
		else
			return mid;
	}
}
