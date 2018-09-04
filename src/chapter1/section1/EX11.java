package chapter1.section1;

public class EX11 {
	public static void main(String[] args) {
		boolean[][] arr = { { true, false, true }, { false, true, false }, { true, false, true } };
		System.out.println(" 123");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1);
			for (boolean j : arr[i]) {
				System.out.print(j ? "*" : " ");
			}
			System.out.println();
		}
	}
}
