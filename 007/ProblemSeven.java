public class ProblemSeven {
	
	public static void main(String args[]){
		int number_of_primes = 0;
		int counter = 2;
		while(number_of_primes < 10001){
			if( isPrime(counter) ){
				number_of_primes++;
				System.out.println(counter);
			}
			counter++;
		}
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