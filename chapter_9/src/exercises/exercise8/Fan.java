/**
 * (The Fan class) Design a class named Fan to represent a fan. 
 * The class contains:
 * 	Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
 * 	A private int data field named speed that specifies the speed of the fan (the default is SLOW).
 *  A private boolean data field named on that specifies whether the fan is on (the default is false).
 *  A private double data field named radius that specifies the radius of the fan (the default is 5).
 *  A string data field named color that specifies the color of the fan (the default is blue).
 *  The accessor and mutator methods for all four data fields.
 *  A no-arg constructor that creates a default fan.
 *  A method named toString() that returns a string description for the fan. 
 *  If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
 *  If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
 */
package exercises.exercise8;

public class Fan {

	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;

	private int speed;
	private boolean isOn;
	private double radius;
	private String color;

	public Fan() {
		this.speed = SLOW;
		this.isOn = false;
		this.radius = 5;
		this.color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {

		if (isOn)
			return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
		return "Fan is off" + ", Color: " + color + ", Radius: " + radius;
	}
}