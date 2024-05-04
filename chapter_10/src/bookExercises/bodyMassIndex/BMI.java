package bookExercises.bodyMassIndex;

public class BMI {

	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;

	private String name;
	private int age;
	private double weight;
	private double height;

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {

		if (getBMI() < 18.5)
			return "Underweight";
		else if (getBMI() < 25)
			return "Normal";
		else if (getBMI() < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}