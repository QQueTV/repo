/*
 * Class: CMSC201 
 * Instructor: Amanullah Khalid
 * Description: This program tests some basic methods of the java.lang.String class. it uses javadoc comments :)
 * Due: 05/12/2025
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Andrew Fortney
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for testing the methods length, charAt, substring, and indexOf in the java.lang.String class.
 */
class StringTest {

    /**
     * Tests the length method.
     *
     * This test case checks the length of an empty string, a string with one character,
     * and a string with multiple characters.
     */
    @Test
    void testLength() {
        assertEquals(0, "".length(), "Test Case 1: Empty string");
        assertEquals(1, "a".length(), "Test Case 2: Single character string");
        assertEquals(13, "Hello, World!".length(), "Test Case 3: Multiple character string");
        assertEquals(0, new String().length(), "Test Case 4: String object created with new");
        assertEquals(5, new String("abcde").length(), "Test Case 5: String object with value");
    }

    /**
     * Tests the charAt method.
     *
     * This test case checks the character at a specific index within the string.
     * It also verifies that an IndexOutOfBoundsException is thrown when the index is out of range.
     */
    @Test
    void testCharAt() {
        String str = "Hello";
        assertEquals('H', str.charAt(0), "Test Case 1: First character");
        assertEquals('e', str.charAt(1), "Test Case 2: Second character");
        assertEquals('o', str.charAt(4), "Test Case 3: Last character");

        // Test for IndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, () -> str.charAt(-1), "Test Case 4: Negative index");
        assertThrows(IndexOutOfBoundsException.class, () -> str.charAt(5), "Test Case 5: Index equal to length");
        assertThrows(IndexOutOfBoundsException.class, () -> str.charAt(100), "Test Case 6: Index greater than length");
    }

    /**
     * Tests the substring method.
     *
     * This test case checks substrings with valid start and end indices,
     * and also verifies that an IndexOutOfBoundsException is thrown when the indices are invalid.
     */
    @Test
    void testSubstring() {
        String str = "Hello, World!";
        assertEquals("Hello", str.substring(0, 5), "Test Case 1: Substring from 0 to 5");
        assertEquals("World!", str.substring(7), "Test Case 2: Substring from 7 to end");
        assertEquals(", ", str.substring(5, 7), "Test Case 3: Substring in the middle");
        assertEquals("Hello, World!", str.substring(0), "Test Case 4: Substring from 0 to the end");
        assertEquals("", str.substring(0,0), "Test Case 5: Empty Substring");

        // Test for IndexOutOfBoundsException or IllegalArgumentException
        assertThrows(IndexOutOfBoundsException.class, () -> str.substring(-1), "Test Case 6: Negative start index");
        assertThrows(IndexOutOfBoundsException.class, () -> str.substring(0, 14), "Test Case 7: end index too large");
        assertThrows(IndexOutOfBoundsException.class, () -> str.substring(5, 2), "Test Case 8: start > end");
        assertThrows(IndexOutOfBoundsException.class, () -> str.substring(14), "Test Case 9: start index out of bounds");
    }

    /**
     * Tests the indexOf method.
     *
     * This test case checks the index of a character and a substring within the string.
     * It also verifies that the correct index is returned when the character or substring is not found.
     */
    @Test
    void testIndexOf() {
        String str = "Hello, World!";
        assertEquals(0, str.indexOf('H'), "Test Case 1: First character");
        assertEquals(4, str.indexOf('o'), "Test Case 2: Character in the middle");
        assertEquals(10, str.indexOf('d'), "Test Case 3: Last character");
        assertEquals(-1, str.indexOf('z'), "Test Case 4: Character not found");

        assertEquals(0, str.indexOf("Hello"), "Test Case 5: First substring");
        assertEquals(7, str.indexOf("World"), "Test Case 6: Substring in the middle");
        assertEquals(12, str.indexOf("!"), "Test Case 7: Last Substring");
        assertEquals(-1, str.indexOf("Goodbye"), "Test Case 8: Substring not found");
        assertEquals(4, str.indexOf("o", 4), "Test Case 9: Starting from index 4");
        assertEquals(-1, str.indexOf("o", 5), "Test Case 10: Not found after index 5");
        assertEquals(0, "aaaaa".indexOf("a", -10), "Test Case 11: Negative fromIndex");
    }
}
