package task_3;

import org.junit.*;
import static org.junit.Assert.*;

public class HashTableTest {

    public HashTableTest() {
    }

    @Test
    public void testAddHash() {
        HashTable instance = new HashTable();
        instance.addHash("b");
        assertTrue(instance.isInHashTable("b"));
    }

    @Test
    public void TestIsInHashTable() {
        HashTable instance = new HashTable();
        assertFalse(instance.isInHashTable("be"));
    }

    @Test
    public void testDeleteElement() {
        HashTable instance = new HashTable();
        instance.addHash("b");
        instance.deleteElement("b");
        assertFalse(instance.isInHashTable("b"));
    }
}
