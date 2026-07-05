import java.util.Iterator;
import java.util.List;

public class SolveSixth {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12,54,76,87,34,56,76);

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
