public class ProblemSix {
	public static void main(String args[]){
		int sum_of_squares = 0;
		int square_of_sum = 0;
		int difference = 0;
		for(int i = 1; i<=100; i++){
			sum_of_squares += (i*i);
			square_of_sum += i;
		}
		square_of_sum = square_of_sum*square_of_sum;
		difference = sum_of_squares - square_of_sum;
		System.out.println(difference);
	}
}