import java.util.List;
import java.util.Optional;

class P1 {
	public static void main(String[] args) {
		List<Integer> nums = List.of(12,52,11,65,98,45,22,90);
		Integer res = nums.stream().filter(x -> x%2==0).reduce((a,b)->a+b).get();
		//Optional<Integer> ans = nums.stream().filter(x -> x%2==0).reduce((a,b)->a+b);
		//if(ans.isPresent()){
		//	System.out.println(ans.get());
		//}
		System.out.println(res);
	}
}
