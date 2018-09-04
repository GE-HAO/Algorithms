package chapter1.section1;

public class EX24 {
	public static int euclid(int p, int q) {
		System.out.println("p=" + p + " q=" + q);
		if (q == 0)
			return p;
		int r = p % q;
		return euclid(q, r);
	}

	public static void main(String[] args) {
		euclid(1111111, 1234567);
	}
}
