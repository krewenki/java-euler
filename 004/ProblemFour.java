public class ProblemFour {

	public static boolean isPalindrome(int n) {
	        return (n == Integer.parseInt(new StringBuffer(""+n).reverse().toString())) ? true : false;
	}
 
	public static void main(String args[]) {
	        int max = 0;
	        for (int i = 100; i <= 999; ++i)
	            for (int j = i; j <= 999; ++j) {
	                int p = i * j;
	                if (isPalindrome(p) && p > max) max = p;
	            }
	        System.out.println(max);
	}
}