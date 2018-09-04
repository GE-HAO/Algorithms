package chapter1.section1;

public class EX20 {
	public static Double fun(int N) {
		if (N < 1) {
			return null;
		}
		if (N == 1) {
			return 0.0;
		}
		return Math.log(N) + fun(N - 1);
	}
}
