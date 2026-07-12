public class GcdProgram {
	public static void main(String[] args) {
		int x = 12, y = 16;
		int ans=1;
		for(int den=Math.min(x,y);den>=1;den--) {
			if(x%den==0 && y%den==0) {
				ans=den;
				break;
			}
		}
		System.out.println(ans);
	}
}
