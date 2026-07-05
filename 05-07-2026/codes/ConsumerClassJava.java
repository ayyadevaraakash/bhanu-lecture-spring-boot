import java.util.function.Consumer;

public class ConsumerClassJava {
	public static void main(String[] args) {
		Consumer<String> machine = (String name) -> {
			System.out.println("Hello World from " + name);
		};
		machine.accept("Akash");
	}
}
