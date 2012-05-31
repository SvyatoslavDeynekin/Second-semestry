package hw41;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    public CalculatorTest() {
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
    public void testMakeOperation() {
        StackInterface stack = new ListStack();
        stack.push(1);
        Calculator calculator = new Calculator(stack);
        calculator.makeOperation(1, '+');
        assertEquals(2, stack.top());
    }

    @Test
    public void testAddNumber() {
        StackInterface stack = new ListStack();
        Calculator calculator = new Calculator(stack);
        calculator.addNumber('4');
        assertEquals(4, stack.top());
    }

    @Test
    public void testGetResult() {
        StackInterface stack = new ListStack();
        Calculator calculator = new Calculator(stack);
        stack.push(1);
        stack.push(2);
        calculator.getResult('*');
        assertEquals(2, stack.top());
    }
}
