public class LcmGcdEuclidean {
	public static void main(String[] args) {
		int x = 16, y = 12;
		int a = x, b = y;
		int rem = 0;
		while (y != 0 ) {
			rem = x % y;
			x = y;
			y = rem;
		}
		System.out.println("GCD IS " + x);
		int lcm = (a * b) / x;
		System.out.println("LCM IS " + lcm);
	}
}
