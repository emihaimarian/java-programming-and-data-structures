package exercises.exercise10;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Queue queue = new Queue();

		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}

		System.out.println(Arrays.toString(queue.getElements()));
		
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		
		System.out.println(Arrays.toString(queue.getElements()));
		
		queue.dequeue();
		
		System.out.println(Arrays.toString(queue.getElements()));
		
		queue.dequeue();
		
		queue.dequeue();
		
		queue.dequeue();

		System.out.println(Arrays.toString(queue.getElements()));
	}
}
