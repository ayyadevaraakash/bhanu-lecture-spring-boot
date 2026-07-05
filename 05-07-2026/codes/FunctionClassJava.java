import java.util.function.Function;

public class FunctionClassJava {
	public static void main(String[] args) {
		Function<Integer,Integer> addFive = x -> x+5;
		Integer x = addFive.apply(10);
		System.out.println(x);
	}
}
