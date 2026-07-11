public class VowelConsonantRebit
{
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u';
    }
    
	public static void main(String[] args) {
	    String s = "acbxm yxmx xcxoxp";
	    int n = s.length();
	    
	    StringBuilder ans = new StringBuilder(s);
	    
	    for(int i=1;i<n;i++) {
	        if (s.charAt(i)=='x' || s.charAt(i)=='X') {
	            char prev = s.charAt(i-1);
	            if (prev==' ') {
	                continue;
	            }
	            if (isVowel(prev)) {
	                ans.setCharAt(i, 'm');
	            } else {
	                ans.setCharAt(i, 'n');
	            }
	        }
	    }
	    
	    System.out.println(ans);
	}
}
