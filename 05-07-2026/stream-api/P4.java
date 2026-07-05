import java.util.Comparator;
import java.util.List;

public class P4 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12,54,98,32,65,98,34,67);
        Integer res = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(res);
    }
}
