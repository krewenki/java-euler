public class ProblemNine {
	public static void main(String args[]){
		
		int a = 0;
		int b = 1;
		int c = 999;
		int sum = 1000;
		
		for(c=997; c>3; c--){
			for(b=c-1; b>a; b--){
				for(a=b-1; a>0; a--){
					if(a+b+c == 1000 && (a*a + b*b == c*c) ){
						System.out.println(a*b*c);
					}
				}
			}
		}
		
	}
}