public class ProblemTen {
	
	public static void main(String args[]){
		
		long sum = 2L; // I got overflows here usin gan int.  Took me a while to realize it. Long fixed it
		for(int i = 3; i<2000000; i=i+2){
			if( isPrime(i) ){
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}
	
	public static boolean isPrime(int n){
		if(n==2){
			return true;
		}
		for(int i = 2; i < Math.sqrt(n)+1; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
}