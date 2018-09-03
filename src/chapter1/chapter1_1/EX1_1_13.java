package chapter1.chapter1_1;

public class EX1_1_13 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, } };
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
	}
}
