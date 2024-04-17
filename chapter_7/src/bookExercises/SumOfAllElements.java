package bookExercises;

public class SumOfAllElements {
	
	public static void main(String[] args) {
		
		double[] array = new double[10];
		
		/** Summing all elements */
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}
}
