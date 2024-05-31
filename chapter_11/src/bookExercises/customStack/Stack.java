package bookExercises.customStack;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> list = new ArrayList<>();

	public Stack() {
	}

	public ArrayList<Object> getList() {
		return list;
	}

	public void setList(ArrayList<Object> list) {
		this.list = list;
	}

	public boolean isEmpty() {
		return getList().isEmpty();
	}

	public int getSize() {
		return getList().size();
	}

	public Object peek() {

		return getList().get(getSize() - 1);
	}

	public Object pop() {

		Object object = getList().get(getSize() - 1);
		getList().remove(getSize() - 1);

		return object;
	}

	public void push(Object object) {
		getList().add(object);
	}

	@Override
	public String toString() {
		return "stack: " + getList().toString();
	}
}
