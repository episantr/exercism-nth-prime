import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {

    List<Integer> primeNumbers = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13));

    int nth(int nth) {

        if (nth <= 0) {
            throw new IllegalArgumentException();
        }

        if (primeNumbers.size() >= nth) {
            return primeNumbers.get(nth - 1);
        } else {
            keepAddingToTheList(nth);
        }


        return primeNumbers.get(nth - 1);
    }

    private void keepAddingToTheList(int nth) {
        boolean isPrime;
        for (int i = primeNumbers.get(primeNumbers.size() - 1) + 1; i < Integer.MAX_VALUE; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
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
    }
}
