package bookExercises.tv;

public class TV {

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;

	public TV() {
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {

		if (on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}

	public void setVolume(int newVolume) {
		if (on && newVolume >= 1 && newVolume <= 7)
			newVolume++;
	}

	public void channelUp() {

		if (on && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
}