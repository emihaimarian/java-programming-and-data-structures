package bookExercises;

public class Main {

    public static void main(String[] args) {

        boolean abcd = isNumeric("ABCD");

        System.out.println(abcd);
    }

    public static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        }
        catch (java.lang.NumberFormatException ex) {
            throw new NumberFormatException("NUMAR");
        }
    }
}
