import java.util.List;

public class P3 {
    static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(12,2,3,5,7,11,43,65,124,78);
        long ans = nums.stream().filter(x -> isPrime(x)).count();
        System.out.println(ans);
    }
}
