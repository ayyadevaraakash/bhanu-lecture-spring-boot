public class MissingNumber
{
	public static void main(String[] args) {
	    int arr[] = {3,2,1,5};
	    int n=arr.length;
	    
	    int expSum = 0;
	    for(int i=1;i<=n+1;i++){
	        expSum = expSum + i;
	    }
	    
	    int actSum = 0;
	    for(int i=0;i<n;i++){
	        actSum += arr[i];
	    }
	    
	    int ans = expSum - actSum;
	    
	    System.out.println(ans);
	}
}
