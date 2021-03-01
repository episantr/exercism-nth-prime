import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    int nth(int nth) {

        if (nth <= 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);

        boolean isPrime;
        for (int i = 7; i < Integer.MAX_VALUE; i++) {
            isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
            if (primeNumbers.size() >= nth) {
                break;
            }
        }

        return primeNumbers.get(nth - 1);
    }
}
