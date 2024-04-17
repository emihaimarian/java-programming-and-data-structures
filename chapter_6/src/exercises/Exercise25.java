/**
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, minutes, and seconds 
 * using the following header: public static String convertMillis(long millis)
 * The method returns a string as hours:minutes:seconds. 
 * For example: 
 * 	convertMillis(5500) returns a string 0:0:5, 
 *  convertMillis(100000)returns a string 0:1:40 
 *  convertMillis(555550000) returns a string 154:19:10. 
 *  Write a test program that prompts the user to enter a long integer for milliseconds and displays a string in the format of 
 *  hours:minutes:seconds.
 */

package exercises;

public class Exercise25 {

	public static void main(String[] args) {

		long millis = 5500;
		System.out.println(converMillis(millis));
		
		millis = 100000;
		System.out.println(converMillis(millis));
		
		millis = 555550000;
		System.out.println(converMillis(millis));
	}

	public static String converMillis(long millis) {

		long seconds = millis / 1000;
		long hours = seconds / 3600;

		seconds = seconds % 3600;
		long minutes = seconds / 60;
		seconds = seconds % 60;

		return hours + ":" + minutes + ":" + seconds;
	}
}
