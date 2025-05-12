package chapter6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for testing the isPrime method in the PrimeNumberMethod class.
 */
class PrimeNumberMethodTest {

    /**
     * Tests the isPrime method.
     *
     * This test case checks if the method correctly identifies prime numbers.
     */
    @Test
    void testIsPrime() {
        // test prime numbers
        assertTrue(PrimeNumberMethod.isPrime(2), "Test Case 1: 2 is prime");
        assertTrue(PrimeNumberMethod.isPrime(3), "Test Case 2: 3 is prime");
        assertTrue(PrimeNumberMethod.isPrime(5), "Test Case 3: 5 is prime");
        assertTrue(PrimeNumberMethod.isPrime(7), "Test Case 4: 7 is prime");
        assertTrue(PrimeNumberMethod.isPrime(11), "Test Case 5: 11 is prime");
        assertTrue(PrimeNumberMethod.isPrime(13), "Test Case 6: 13 is prime");
        assertTrue(PrimeNumberMethod.isPrime(29), "Test Case 7: 29 is prime");
        assertTrue(PrimeNumberMethod.isPrime(97), "Test Case 8: 97 is prime");

        // test non-prime numbers
        assertFalse(PrimeNumberMethod.isPrime(1), "Test Case 9: 1 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(4), "Test Case 10: 4 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(6), "Test Case 11: 6 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(8), "Test Case 12: 8 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(9), "Test Case 13: 9 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(10), "Test Case 14: 10 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(12), "Test Case 15: 12 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(15), "Test Case 16: 15 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(25), "Test Case 17: 25 is not prime");

        
        // Test negatives
        assertFalse(PrimeNumberMethod.isPrime(0), "Test Case 18: 0 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(-1), "Test Case 19: -1 is not prime");
        assertFalse(PrimeNumberMethod.isPrime(-2), "Test Case 20: -2 is not prime");
    }
}
