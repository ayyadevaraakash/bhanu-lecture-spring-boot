import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P5 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12,87,34,65,9,23,65,34,66);
        Map<Boolean,List<Integer>> ans = nums.stream().collect(Collectors.partitioningBy(x -> x%2==0));
        for (Map.Entry<Boolean,List<Integer>> cur : ans.entrySet()) {
            System.out.println(cur.getKey() + " " + cur.getValue());
        }
    }
}
