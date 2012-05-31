package hw21;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class MainTest {

    public MainTest() {
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

    /**
     * Test of helixSort method, of class Main.
     */
    @Test
    public void testHelixSort() {
        int[][] array1 = new int[3][3];
        array1[0][0] = 3;
        array1[0][1] = 8;
        array1[0][2] = 78;
        array1[1][0] = 89;
        array1[1][1] = 12;
        array1[1][2] = 32;
        array1[2][0] = 0;
        array1[2][1] = 9;
        array1[2][2] = 65;
        int []expected = new int[9];
        expected[0] = 12;
        expected[1] = 9;
        expected[2] = 0;
        expected[3] = 89;
        expected[4] = 3;
        expected[5] = 8;
        expected[6] = 78;
        expected[7] = 32;
        expected[8] = 65;
        int [] actual = Main.helixSort(array1);
        for (int i = 0; i < actual.length; i++){
            assertEquals(actual[i], expected[i]);
        }
    }
}