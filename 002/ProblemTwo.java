public class ProblemTwo {
	public static void main(String args[]){
		int x = 0;
		int y = 1;
		int z = 0;
        int sum = 0;
        while ((z = x + y) <= 4000000) {
            if (z % 2 == 0) sum += z;
            x = y;
            y = z;
        }
		System.out.println(sum);
	}
}