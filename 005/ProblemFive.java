public class ProblemFive {
	public static void main(String args[]){
		long num = 0L;
		int remainder = 0;
		boolean found = false;
		while(!found){
			num += 20;
			remainder = 0;
			
			for(int i = 1; i<21; i++){
				remainder += num%i;
			}
			
			if(remainder == 0){
				found=true;
			}
		}
		
		System.out.println(num);

	}
}