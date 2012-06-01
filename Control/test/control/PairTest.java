package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PairTest {

    public PairTest() {
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
    public void testMultiplicationFirst() {
        System.out.println("Multiplication");
        float x = 4;
        Pair instance = new Pair(14, 88);
        Pair scaled = instance.multiplication(x);
        assertEquals((float) 56, scaled.getFirst(), 0);
    }

    @Test
    public void testMultiplicationSecond() {
        System.out.println("Multiplication");
        float x = 4;
        Pair instance = new Pair(14, 88);
        Pair scaled = instance.multiplication(x);
        assertEquals((float) 352, scaled.getSecond(), 0);
    }

    @Test
    public void testSummary1() {
        System.out.println("Summary");
        Pair pair1 = new Pair(4, 7);
        Pair pair2 = new Pair(3, 8);
        Pair result = pair1.summary(pair2);
        assertEquals(7, result.getFirst(), 0);
    }

    @Test
    public void testSummary2() {
        System.out.println("Summary");
        Pair pair1 = new Pair(4, 7);
        Pair pair2 = new Pair(3, 8);
        Pair result = pair1.summary(pair2);
        assertEquals(15, result.getSecond(), 0);
    }
}
