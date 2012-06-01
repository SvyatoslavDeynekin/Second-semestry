package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberTest {

    public ComplexNumberTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMultiplication1() {
        System.out.println("Multiplication1");
        ComplexNumber n1 = new ComplexNumber(3, 8);
        ComplexNumber n2 = new ComplexNumber(4, 9);
        ComplexNumber result = n1.Multiplication1(n2);
        assertEquals(-60, result.getFirst(), 0);
    }

    @Test
    public void testMultiplication2() {
        System.out.println("Multiplication1");
        ComplexNumber n1 = new ComplexNumber(3, 8);
        ComplexNumber n2 = new ComplexNumber(4, 9);
        ComplexNumber result = n1.Multiplication1(n2);
        assertEquals(59, result.getSecond(), 0);
    }
    
    @Test
    public void testAbs() {
        System.out.println("abs");
        ComplexNumber n1 = new ComplexNumber(6, 8);
        double result = n1.abs();
        assertEquals(10, result, 0);
    }

}