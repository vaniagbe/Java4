import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("tenet"));
        assertTrue(Palindrome.isPalindrome("Kayak"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("cat"));
    }

    @Test
    public void testEmpty() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testSpaces() {
        assertTrue(Palindrome.isPalindrome("t a c o c a t"));
    }

    @Test
    public void testUppercase() {
        assertTrue(Palindrome.isPalindrome("Tenet"));
    }
}