import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class PrimeCalculatorTest {

    private PrimeCalculator primeCalculator = new PrimeCalculator();

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculator.nth(1)).isEqualTo(2);
    }

    @Test
    public void testSecondPrime() {
        assertThat(primeCalculator.nth(2)).isEqualTo(3);
    }

    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.nth(6)).isEqualTo(13);
    }

    @Test
    public void testBigPrime1() {
        assertThat(primeCalculator.nth(101)).isEqualTo(547);
    }

    @Test
    public void testBigPrime2() {
        assertThat(primeCalculator.nth(1001)).isEqualTo(7927);
    }

    @Test
    public void testBigPrime3() {
        assertThat(primeCalculator.nth(10001)).isEqualTo(104743);
    }

    @Test
    public void testUndefinedPrime() {
        assertThrows(
            IllegalArgumentException.class,
            () -> primeCalculator.nth(0));
    }

}
