public class MissingNumberXor
{
	public static void main(String[] args) {
	    int arr[] = {3,2,1,5};
	    int n=arr.length;
	    
	    int expXor = 0;
	    for(int i=1;i<=n+1;i++){
	        expXor = expXor ^ i;
	    }
	    
	    int actXor = 0;
	    for(int i=0;i<n;i++){
	        actXor ^= arr[i];
	    }
	    
	    int ans = expXor ^ actXor;
	    
	    System.out.println(ans);
	}
}
