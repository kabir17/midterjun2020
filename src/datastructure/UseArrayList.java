package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * https://github.com/kabir17/midterjun2020.git
		 */

		List<String> listMidterm = new ArrayList<String>();
		listMidterm.add("Ullah");
		listMidterm.add("Velerie");
		listMidterm.add("kabir");

		System.out.println("For each loop total : ");
		for (String list : listMidterm){
			System.out.println(list);
		}

		System.out.println("After Add total element : "+listMidterm);
		System.out.println("Remove kabir : "+listMidterm.remove(2));
		System.out.println("After Remove total element : "+listMidterm);
		System.out.println("Retrieve data by index : "+listMidterm.get(0));
		System.out.println("Retrieve data by index : "+listMidterm.get(1));
		System.out.println("Retrieve total data : "+listMidterm);
		//contains=find element in the arrayList or no, true/false.So kajol is false.
		System.out.println(listMidterm.contains("kajol"));

		System.out.print("Iterator total :");
		Iterator it = listMidterm.listIterator();
		while (it.hasNext()){
			System.out.print("  "+it.next());
		}
	}
}
