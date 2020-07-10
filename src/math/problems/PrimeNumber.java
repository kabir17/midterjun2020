package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		//declare ArrayList first
		List<Integer> primeList = new ArrayList<Integer>();

		//declare variable as max
		int max = 10000;
		for (int x=2; x<max; x++){
				boolean isPrime = true;
				for (int y=2; y<x; y++){
					if (x % y == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeList.add(x);
				}
			System.out.println(primeList);
		}
	}
}
