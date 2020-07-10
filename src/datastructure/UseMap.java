package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		//Create List by Arraylist/storing data into Arraylist.
		List<String> airlines = new ArrayList<String>();
		airlines.add("American airlines");
		airlines.add("Delta airlines");
		airlines.add("Unitd airlines");

		List<String> newYorkCity = new ArrayList<String>();
		newYorkCity.add("Statue of liberty");
		newYorkCity.add("Empire State building");
		newYorkCity.add("Freedom Tower");

		List<String> nycTransport = new ArrayList<String>();
		nycTransport.add("Subway");
		nycTransport.add("MTA");
		nycTransport.add("taxi and Uber");

		//storing arrayList data into hashmap
		Map<String, List<String>> newYork = new HashMap<String, List<String>>();
		newYork.put("NewYork Airlines-->", airlines);
		newYork.put("Famous building--->", newYorkCity);
		newYork.put("Transportation---->", nycTransport);
		System.out.println("Iterator result : ");
		IteratorMap(newYork); //import Iterator method here but this method made out of main method.

		System.out.println("\n"+"-------------------------------------------------------------");
		System.out.println("\n"+"Retrieve data by for..each loop :");
		for (Map.Entry<String, List<String>> mapList : newYork.entrySet()) {
			System.out.println("\n" + mapList.getKey() + mapList.getValue());
		}
	}
	//this method came by import but retrieve outside of main method then use Iterator loop
	private static void IteratorMap(Map<String, List<String>> newYork) {
		Iterator<Map.Entry<String,List<String>>> mapIt = newYork.entrySet().iterator();
		while (mapIt.hasNext()){
			Map.Entry<String,List<String>> mapIt2 = mapIt.next();
			System.out.print("\n"+mapIt2.getKey());
			System.out.print(mapIt2.getValue());
		}
	}
}
