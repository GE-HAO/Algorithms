package chapter1.section1;

public class EX14 {
	public static Integer lg(int N) {
		if (N <= 0) {
			return null;
		} else if (N <= 1) {
			return 0;
		} else {
			int i = 1;
			int j = 2;
			while (j * 2 <= N) {
				i++;
				j *= 2;
			}
			return i;
		}
	}
}
