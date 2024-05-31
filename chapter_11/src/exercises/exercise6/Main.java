/**
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan 
 * object, a Date object, a string, and a Circle object to the list, and use a loop to 
 * display all the elements in the list by invoking the object’s toString() method.
 */
package exercises.exercise6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Object> objectList = new ArrayList<Object>();

		objectList.add(new Loan());
		objectList.add(new Circle());
		objectList.add(new Date());
		objectList.add(new String("Polymorphism"));

		for (Object object : objectList) {
			System.out.println(object.toString());
		}
	}

}

class Loan {

	@Override
	public String toString() {
		return "Loan";
	}

}

class Circle {

	@Override
	public String toString() {
		return "Circle";
	}
}