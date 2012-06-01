package generic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Славес
 */
public class SetTest {

    public SetTest() {
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
     * Test of getValue method, of class Set.
     */
    @Test
    public void testGetValue()throws Exception {
        System.out.println("getValue");
        Set<Integer> instance = new Set<Integer>();
        Object expResult = 2;
        instance.addValue(1);
        instance.addValue(2);
        Object result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of Set method, of class Set.
     */
    @Test
    public void testSet() {
        System.out.println("Set");
        Set<Integer> instance = new Set<Integer>();
        instance.Set();
    }

    /**
     * Test of findElement method, of class Set.
     */
    @Test
    public void testFindElement() {
        System.out.println("findElement");
        Set<Integer> instance = new Set<Integer>();
        boolean expResult = false;
        boolean result = instance.findValue(2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteElement method, of class Set.
     */
    @Test
    public void testDeleteElement() throws Exception {
        System.out.println("deleteElement");
        Set<Integer> instance = new Set<Integer>();
        instance.addValue(1);
        instance.addValue(2);
        instance.deleteValue(1);
        assertFalse(instance.findValue(1));
    }

    /**
     * Test of addElement method, of class Set.
     */
    @Test
    public void testAddElement() throws Exception {
        System.out.println("addElement");
        Set instance = new Set();
        instance.addValue(2);
        instance.addValue(4);
        instance.deleteValue(4);
        assertEquals(2, instance.getValue());
    }

    /**
     * Test of printList method, of class Set.
     */
    @Test
    public void testPrintList() {
        System.out.println("printList");
        Set instance = new Set();
        instance.printList();
    }

    /**
     * Test of Crossing method, of class Set.
     */
    @Test
    public void testIntersection() throws Exception {
        System.out.println("Intersection");
        Set<Character> second = new Set();
        second.addValue('a');
        second.addValue('b');
        second.addValue('c');
        Set instance = new Set();
        instance.addValue('c');
        instance.addValue('x');
        instance.addValue('y');
        second.Intersection(instance);
    }

    /**
     * Test of Unification method, of class Set.
     */
    @Test
    public void testUnification() throws Exception {
        System.out.println("Unification");
        Set<Character> second = new Set();
        second.addValue('a');
        second.addValue('b');
        second.addValue('c');
        second.addValue('e');
        Set instance = new Set();
        instance.addValue('x');
        instance.addValue('y');
        instance.addValue('z');
        second.Unification(instance);
    }

}