public class ProblemEight {
	
	public static void main(String args[]){
		
		int max = 0;
		int product = 0;
		int first;
		int second;
		int third;
		int fourth;
		int fifth;
		String chunk = "";
		String number = "73167176531330624919225119674426574742355349194934";
				number += "96983520312774506326239578318016984801869478851843";
				number += "85861560789112949495459501737958331952853208805511";
				number += "12540698747158523863050715693290963295227443043557";
				number += "66896648950445244523161731856403098711121722383113";
				number += "62229893423380308135336276614282806444486645238749";
				number += "30358907296290491560440772390713810515859307960866";
				number += "70172427121883998797908792274921901699720888093776";
				number += "65727333001053367881220235421809751254540594752243";
				number += "52584907711670556013604839586446706324415722155397";
				number += "53697817977846174064955149290862569321978468622482";
				number += "83972241375657056057490261407972968652414535100474";
				number += "82166370484403199890008895243450658541227588666881";
				number += "16427171479924442928230863465674813919123162824586";
				number += "17866458359124566529476545682848912883142607690042";
				number += "24219022671055626321111109370544217506941658960408";
				number += "07198403850962455444362981230987879927244284909188";
				number += "84580156166097919133875499200524063689912560717606";
				number += "05886116467109405077541002256983155200055935729725";
				number += "71636269561882670428252483600823257530420752963450";
		
				for(int i = 5; i<=1000; i++){
					chunk = number.substring(i-5, i);
					first = Integer.parseInt(chunk.substring(0,1));
					second = Integer.parseInt(chunk.substring(1,2));
					third = Integer.parseInt(chunk.substring(2,3));
					fourth = Integer.parseInt(chunk.substring(3,4));
					fifth = Integer.parseInt(chunk.substring(4,5));
					product = first * second * third * fourth * fifth;
					if(product > max){
						max = product;
						System.out.println(product);
					}

				}
	}
	
}