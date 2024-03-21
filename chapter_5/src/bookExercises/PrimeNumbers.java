package src.bookExercises;

public class PrimeNumbers {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;
        int initialNumber = 2;

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= initialNumber / 2; divisor++) {

                if (initialNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println(initialNumber);
                }else{
                    System.out.print(initialNumber + " ");
                }
            }

            initialNumber++;
        }
    }
}
