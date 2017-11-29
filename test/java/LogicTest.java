import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LogicTest {
    private Logic tester= new Logic();
    @Test
    public void testMultiplicationByOne() throws Exception {
        assertEquals("10 x 1 must be 10.0", 10.0, tester.multiplication(10, 1));

    }
    @Test
    public void testMultiplicationByZero() throws Exception {
        assertEquals("10 x 0 must be 0", 0.0, tester.multiplication(10, 0));

    }
    @Test
    public void testMultiplicationByRational() throws Exception {
        assertEquals("10 x 1.5 must be 50", 15.0, tester.multiplication(10, 1.5));

    }
    @Test
    public void testMultiplication() throws Exception {
        assertEquals("10 x 5 must be 50", 50.0, tester.multiplication(10, 5));

    }


    @Test
    public void testAdditionByZero() throws Exception {
        assertEquals("1 + 0 must be 1.0", 1.0, tester.addition(1, 0));

    }
    @Test
    public void testAdditionByRational() throws Exception {
        assertEquals("1 + 5.5 must be 6.5", 6.5, tester.addition(1, 5.5));

    }
    @Test
    public void testAddition() throws Exception {
        assertEquals("1 + 5.5 must be 6.5", 6.5, tester.addition(1, 5.5));

    }


    @Test
    public void testSubtraction() throws Exception {
        assertEquals("5 - 2 must be 3", 3.0, tester.subtraction(5, 2));

    }
    @Test
    public void testSubtractionByZero() throws Exception {
        assertEquals("2 - 0 must be 2", 2.0, tester.subtraction(2, 0));

    }
    @Test
    public void testSubtractionNegative() throws Exception {
        assertEquals("2 - 5 must be -3", -3.0, tester.subtraction(2, 5));

    }


    @Test
    public void testDivision() throws Exception {
        assertEquals("6 / 2 must be 3", 3.0, tester.division(6, 2));

    }
    @Test
    public void testDivisionZero() throws Exception {
        assertEquals("0 / 3 must be 0 ", 0.0, tester.division(0, 3));
    }
    @Test
    public void testDivisionByOne() throws Exception {
        assertEquals("3 / 1 must be 3", 3.0, tester.division(3, 1));
    }
    @Test
    public void testDivisionByRational() throws Exception {
        assertEquals("3 / 1.5 must be 2", 2.0, tester.division(3, 1.5));
    }
    @Test
    public void testDivisionRational() throws Exception {
        assertEquals("3 / 2 must be 1.5", 1.5, tester.division(3, 2));

    }
}
