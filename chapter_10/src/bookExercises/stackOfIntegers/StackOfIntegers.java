package bookExercises.stackOfIntegers;

public class StackOfIntegers {

	public static final int DEFAULT_CAPACITY = 16;

	private int[] elements;
	private int size;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public boolean empty() {
		return size == 0;
	}

	public void push(int value) {

		if (size >= elements.length) {
			int[] tempArray = new int[elements.length * 2];
			System.arraycopy(elements, 0, tempArray, 0, elements.length);
			elements = tempArray;
		}

		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}

	public int getSize() {
		return size;
	}
}