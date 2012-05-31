package hw22;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
     * Test of main method, of class Main.
     */
    /**
     * Test of columnFirstElementSort method, of class Main.
     */
    @Test
    public void testColumnFirstElementSort() {
        int[][] array1 = new int[3][3];
        array1[0][0] = 8;
        array1[0][1] = 9;
        array1[0][2] = 3;
        array1[1][0] = 5;
        array1[1][1] = 6;
        array1[1][2] = 1;
        array1[2][0] = 3;
        array1[2][1] = 4;
        array1[2][2] = 2;
        int[][] expected = new int[3][3];
        expected[0][0] = 3;
        expected[0][1] = 8;
        expected[0][2] = 9;
        expected[1][0] = 1;
        expected[1][1] = 5;
        expected[1][2] = 6;
        expected[2][0] = 2;
        expected[2][1] = 3;
        expected[2][2] = 4;
        int[][] actual = Main.columnFirstElementSort(array1);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
