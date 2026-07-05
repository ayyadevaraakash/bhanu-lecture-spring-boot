import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class P2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,54,23,65,1,65,73,33,21,12);
        OptionalInt ans=nums.stream().filter(x->x%2!=0).mapToInt(x -> x).max();
        if (ans.isPresent()) {
            System.out.println(ans.getAsInt());
        }
    }
}
