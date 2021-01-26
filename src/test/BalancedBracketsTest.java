package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[A]"));
    }

    @Test
    public void testSetsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Dim][Sum]"));
    }
    @Test
    public void testUnclosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Samsung"));
    }
    @Test
    public void testUnclosedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Succulent]["));
    }
    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Root[Beer]]"));
    }
    @Test
    public void test3SetsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Over[Night[Sensation]]]"));
    }
    @Test
    public void testInvertedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Bingo["));
    }
}
