/**
 * 1.10 (Average speed in miles) Assume a runner runs 15 kilometers in 50 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */
public class Exercise10 {

    public static void main(String[] args){

        //Convert km in miles
        double miles = 15 / 1.6;
        //Average speed in miles per hour
        double speed = miles/(50.5/60);

        System.out.println(speed);

    }
}
