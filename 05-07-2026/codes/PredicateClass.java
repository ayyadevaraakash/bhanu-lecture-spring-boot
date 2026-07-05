import java.util.function.Predicate;

public class PredicateClass {
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x%2==0 ? true : false;
		boolean result = isEven.test(15);
		System.out.println(result);
	}
}
