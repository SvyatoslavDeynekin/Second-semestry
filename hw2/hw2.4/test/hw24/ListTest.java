package hw24;

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
public class ListTest {

    public ListTest() {
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
     * Test of AddElement method, of class List.
     */
    @Test
    public void testAddElement() {
        System.out.println("AddElement");
        List instance = new List();
        for (int i = 0; i < 5; i++) {
            instance.AddElement(i);
        }
        instance.PrintList();
    }

    /**
     * Test of DeleteElement method, of class List.
     */
    @Test
    public void testDeleteElement() {
        System.out.println("DeleteElement");
        List instance = new List();
        for (int i = 0; i < 5; i++){
        instance.AddElement(i);
        }
        instance.DeleteElement(2);
        instance.DeleteElement(4);
        instance.PrintList();
    }

    /**
     * Test of PrintList method, of class List.
     */
    @Test
    public void testPrintList() {
        System.out.println("PrintList");
        List instance = new List();
        instance.AddElement(2);
        instance.PrintList();

    }
}
