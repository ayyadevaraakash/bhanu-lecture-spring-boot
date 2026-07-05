import java.util.concurrent.CopyOnWriteArrayList;

public class SolveSeventh {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        CopyOnWriteArrayList<Integer> nums = new CopyOnWriteArrayList<>();
        nums.add(12);
        nums.add(57);
        nums.add(43);
        nums.add(15);
        nums.add(19);

        for(Integer x : nums) {
            if (x==15) {
                nums.add(99);
            }
            System.out.print(x + " ");
        }
        System.out.println();

        // System.out.println(nums.size());
    }
}
