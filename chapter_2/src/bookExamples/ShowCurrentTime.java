package bookExamples;

public class ShowCurrentTime {

    public static void main(String[] args) {

        //Epoch Time
        final long totalMilliseconds = System.currentTimeMillis();

        final long totalSeconds = totalMilliseconds / 1000;
        final long currentSecond = totalSeconds % 60;

        final long totalMinutes = totalSeconds / 60;
        final long currentMinute = totalMinutes % 60;

        final long totalHours = totalMinutes / 60;
        final long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
