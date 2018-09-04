package chapter1.section1;

public class EX19 {
	public static long F(int N) {
		long[] arr = new long[N + 1];
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else {
			arr[0] = 0;
			arr[1] = 1;
		}
		for (int i = 2; i <= N; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[N];
	}
}
