public class LcmProgram {
	public static void main(String[] args) {
		int x = 12, y = 16;
		int ans=0;
		for(int num=Math.max(x,y);num<=x*y;num++) {
			if(num%x==0 && num%y==0) {
				ans=num;
				break;
			}
		}
		System.out.println(ans);
	}
}
