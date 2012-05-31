package hw23;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {

    public StackTest() {
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
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() throws Exception {
        Stack a;
        a = new Stack();
        a.push(20);
        a.push(2);
        int result = a.pop();
        assertEquals(2, result);
        assertEquals(20, a.pop());
    }

    @Test(expected = Exception.class)
    public void testPop() throws Exception {
        Stack a = new Stack();
        a.pop();
        int result = a.pop();
        assertEquals(0, result);
    }

}