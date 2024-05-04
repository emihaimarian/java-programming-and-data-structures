/**
 * Section 10.6 gives a class for Stack. Design a class named Queue for storing integers. 
 * Like a stack, a queue holds elements. 
 * In a stack, the elements are retrieved in a last-in first-out fashion. 
 * In a queue, the elements are retrieved in a first-in first-out fashion. 
 * The class contains: 
 * 	An int[] data field named elements that stores the int values in the queue.
 * 	A data field named size that stores the number of elements in the queue.
 * 	A constructor that creates a Queue object with default capacity 8.
 *  The method enqueue(int v) that adds v into the queue.
 *  The method dequeue() that removes and returns the element from the queue.
 *  The method empty() that returns true if the queue is empty.
 *  The method getSize() that returns the size of the queue.
 */
package exercises.exercise10;

public class Queue {

	public static final int DEFAULT_CAPACITY = 8;

	private int[] elements;
	private int size;

	public Queue(int capacity) {
		elements = new int[capacity];
	}

	public Queue() {
		this(DEFAULT_CAPACITY);
	}

	// Adds value into the queue -> In a queue the elements are added at the end of
	// the array
	public void enqueue(int value) {

		if (size >= elements.length) {
			int[] tempArray = new int[elements.length + 1];
			System.arraycopy(elements, 0, tempArray, 0, elements.length);
			elements = tempArray;
		}

		elements[size++] = value;
	}

	// Remove and return the element from the queue -> In a queue the elements are
	// removed from the beginning of the array
	public int dequeue() {

		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		int dequeued = elements[0];
		System.arraycopy(elements, 1, elements, 0, elements.length - 1);
		elements[size - 1] = 0;
		size--;

		return dequeued;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public int[] getElements() {
		return elements;
	}
}
