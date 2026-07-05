import java.util.Collections;
import java.util.List;

public class P6 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12,43,12,43,32,65,76,45,87,12,35);
        Integer res = nums.stream().filter(x -> Collections.frequency(nums, x) == 1).findFirst().get();
        System.out.println(res);
    }
}
