/**
 * (The WeatherStation class) Design a class named WeatherStation. The class contains:
 * The data fields temperature (in °C) and pressure (in bar). 
 * A no-arg constructor that creates a WeatherStation where temperature is 0 (°C) and pressure is 1 (bar).
 * A constructor that constructs a WeatherStation object with particular temperature (in °C) and pressure (in bar).
 * A static method that constructs a WeatherStation object with imperial unit values, 
 * 	so temperature in °F and pressure in PSI (It should automatically 
 *  convert to the valid metric representation before assigning to the data fields.)
 * Two getter methods for the data fields temperature and pressure.
 * Two getter methods that convert the data fields to corresponding imperial units (°F and PSI). 
 * Methods named setTemperature(double temperature) and setPressure(double pressure) that set the data fields using metric values.
 * Methods named setTemperatureFahrenheit(double temperature) and setPressurePSI(double pressure) that set the data fields using 
 * imperial values (They should automatically convert to the underlying metric representation.)
 */

package exercises.exercise1;

public class WeatherStation {

	private double temperature;
	private double pressure;

	public WeatherStation() {
		this(0, 1);
	}

	public WeatherStation(double temperature, double pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
	}

	public static WeatherStation fromImperial(double temperatureFahrenheit, double pressurePSI) {
		double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
		double pressureBar = pressurePSI * 0.0689476;
		return new WeatherStation(temperatureCelsius, pressureBar);
	}

	public double getTemperature() {
		return temperature;
	}

	public double getTemperatureFahrenheit() {
		return temperature * 9 / 5 + 32;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setTemperatureFahrenheit(double temperature) {
		this.temperature = (temperature - 32) * 5 / 9;
	}

	public double getPressure() {
		return pressure;
	}

	public double getPressurePSI() {
		return pressure / 0.0689476;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public void setPressurePSI(double pressure) {
		this.pressure = pressure * 0.0689476;
	}
}
