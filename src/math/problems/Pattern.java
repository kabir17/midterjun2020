package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 */
		
		pattern(100);

	}
	public static void pattern(int num){
		int s= num;
		for(int i=1; i <10; i++){
			int l = i * 10;
			int j = (i * 10)/10;
			for (int k=1; k > 0; k-= j){
				s-=j;
				System.out.println(s);
			}
		}
	}
}
