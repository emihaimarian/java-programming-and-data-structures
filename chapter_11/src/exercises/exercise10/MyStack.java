/**
 * (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition. 
 * Define a new stack class that extends ArrayList.
 */
package exercises.exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

	private static final long serialVersionUID = -5443724110967521940L;

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return size();
	}

	public Object peek() {
		return get(getSize() - 1);
	}

	public Object pop() {
		return remove(getSize() - 1);
	}

	public Object push(Object object) {
		add(object);
		return object;
	}

	@Override
	public String toString() {
		return "stack: " + toString();
	}
}
