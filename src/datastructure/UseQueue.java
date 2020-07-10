package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<String>();
		queue.add("Ullah");
		queue.add("Velerie");
		queue.add("Poppy");
		queue.add("kabir");


		System.out.println("Queue for..each display : ");
		for (String st : queue){
			System.out.println(st);
		}

		System.out.println("Queue Iterator result : ");
		Iterator it = queue.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("First element retrieve as peek : "+queue.peek());
		System.out.println("Remove First element from Queue list : "+queue.remove());
		System.out.println("After remove Queue element : "+queue);
		System.out.println("After poll Queue element : "+queue.poll());
	}
}
