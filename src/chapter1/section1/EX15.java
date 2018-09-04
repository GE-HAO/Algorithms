package chapter1.section1;

public class EX15 {
	public static int[] histogram(int a[], int M) {
		int arr[] = new int[M];
		for (int i = 0; i < M; i++) {
			for (int j : a) {
				if (j == i) {
					arr[i]++;
				}
			}
		}
		return arr;
	}
}
