/**
 * Write a test programs that creates three WeatherStation objects (using new WeatherStation(), 
 * new WeatherStation(35, 0.5), and WeatherStation.fromImperial(68, 21)) 
 * and displays their temperature and pressure, in both metric units (°C and bar) and imperial units (°F and PSI).
 */
package exercises.exercise1;

public class Main {

	public static void main(String[] args) {

		WeatherStation weatherStation1 = new WeatherStation();

		System.out.println("Get pressure in bar: " + weatherStation1.getPressure());
		System.out.println("Get temperature in Celsius: " + weatherStation1.getTemperature());

		System.out.println("Get pressure in PSI: " + weatherStation1.getPressurePSI());
		System.out.println("Get temperature in Fahrenheit: " + weatherStation1.getTemperatureFahrenheit());

		WeatherStation weatherStation2 = new WeatherStation(35, 0.5);
		System.out.println("\nGet pressure in bar: " + weatherStation2.getPressure());
		System.out.println("Get temperature in Celsius: " + weatherStation1.getTemperature());

		System.out.println("Get pressure in PSI: " + weatherStation2.getPressurePSI());
		System.out.println("Get temperature in Fahrenheit: " + weatherStation2.getTemperatureFahrenheit());

		WeatherStation fromImperial = WeatherStation.fromImperial(68, 21);
		System.out.println("\nGet pressure in bar: " + fromImperial.getPressure());
		System.out.println("Get temperature in Celsius: " + fromImperial.getTemperature());

		System.out.println("Get pressure in PSI: " + fromImperial.getPressurePSI());
		System.out.println("Get temperature in Fahrenheit: " + fromImperial.getTemperatureFahrenheit());
	}
}
