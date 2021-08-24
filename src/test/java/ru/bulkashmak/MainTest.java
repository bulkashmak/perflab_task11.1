package ru.bulkashmak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    static Utility utility;
    static String result;
    int[] array = {1, 2, 3};

    @BeforeAll
    public static void setup() {
        utility = new Utility();
    }

    @BeforeEach
    public void beforeEach() {
        result = utility.convert(array);
    }

    @Test
    void testForString() {

        Assertions.assertEquals(result.getClass(), String.class);
    }

    @Test
    void testNotNull() {

        Assertions.assertNotNull(result);
    }

    @Test
    void testNotEmpty() {

        Assertions.assertTrue(result.length() > 0);
    }

    @Test
    void testSplitsWithSpaces() {

        Assertions.assertTrue(result.contains(" "));
    }

    @Test
    void testHasNoSpaceAtTheEnd() {

        Assertions.assertFalse(result.matches("\\s$"));
    }

    @Test
    void numbersInStringEqualsNumbersInArray() {

        String[] resArray = result.split("\\s");
        for (int i = 0; i<array.length; i++) {
            Assertions.assertEquals(array[i], Integer.parseInt(resArray[i]));
        }
    }
}