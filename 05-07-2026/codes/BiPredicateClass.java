import java.util.function.BiPredicate;

public class BiPredicateClass {
	public static int gcd(int x, int y) {
		return y==0?x:gcd(y,x%y);
	}

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isCoPrime=(x,y) -> gcd(x,y)==1;
		boolean res = isCoPrime.test(24,34);
		System.out.println(res);
	}
}
