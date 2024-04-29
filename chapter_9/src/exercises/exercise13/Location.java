/**
 * (The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue that store the maximal value 
 * and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.
 */
package exercises.exercise13;

public class Location {

	private int row;
	private int column;
	private double maxValue;

	public Location() {
	}

	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
}