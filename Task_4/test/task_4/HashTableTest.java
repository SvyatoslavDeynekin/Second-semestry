
package task_4;
import org.junit.*;
import static org.junit.Assert.*;


public class HashTableTest {

    public HashTableTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        hashFunc = new HashFunction();
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testAddHash() {
        HashTable instance = new HashTable(hashFunc);
        instance.addHash("b");
        assertTrue(instance.isInHashTable("b"));
    }


    @Test
    public void TestIsInHashTable() {
        HashTable instance = new HashTable(hashFunc);
        assertFalse(instance.isInHashTable("be"));
    }


    @Test
    public void testDeleteElement() {
        HashTable instance = new HashTable(hashFunc);
        instance.addHash("b");
        instance.deleteElement("b");
        assertFalse(instance.isInHashTable("b"));
    }


    @Test
    public void testChangeHashFunction() {
        HashTable instance = new HashTable(hashFunc);
        instance.addHash("abc");
        instance.addHash("fdc");
        hashFunc = new HashFunction1();
        instance.changeHashFunction(hashFunc);
        assertTrue(instance.isInHashTable("abc"));
        assertTrue(instance.isInHashTable("fdc"));
    }

    HashFucntionInterface hashFunc;
}