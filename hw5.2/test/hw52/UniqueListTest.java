package hw52;

import org.junit.*;
import static org.junit.Assert.*;

public class UniqueListTest {

    @Test
    public void testInsert() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.insert(0, 15);
        uniqueList.insert(1, 20);
        assertTrue(uniqueList.exist(10));
        assertTrue(uniqueList.exist(15));
        assertTrue(uniqueList.exist(20));
    }

    @Test
    public void testAddToHead() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.addToHead(15);
        uniqueList.addToHead(20);
        assertTrue(uniqueList.exist(10));
        assertTrue(uniqueList.exist(15));
        assertTrue(uniqueList.exist(20));
    }

    @Test
    public void testAddToEnd() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToEnd(10);
        uniqueList.addToEnd(15);
        uniqueList.addToEnd(20);
        assertTrue(uniqueList.exist(10));
        assertTrue(uniqueList.exist(15));
        assertTrue(uniqueList.exist(20));
    }

    @Test
    public void testDeleteElement() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.addToHead(15);
        uniqueList.addToHead(20);
        uniqueList.deleteElement(10);
        uniqueList.deleteElement(15);
        uniqueList.deleteElement(20);
    }

    @Test(expected = ExistException.class)
    public void testInsertException() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.insert(0, 15);
        uniqueList.insert(1, 10);
    }

    @Test(expected = ExistException.class)
    public void testAddToHeadException() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.addToHead(15);
        uniqueList.addToHead(20);
        uniqueList.addToHead(15);
        uniqueList.addToHead(20);
    }

    @Test(expected = ExistException.class)
    public void testAddToEndException() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToEnd(10);
        uniqueList.addToEnd(15);
        uniqueList.addToEnd(20);
        uniqueList.addToEnd(15);
        uniqueList.addToEnd(20);
    }

    @Test(expected = NotFound.class)
    public void testDeleteElementException() throws Exception {
        UniqueList<Integer> uniqueList = new UniqueList<Integer>();
        uniqueList.addToHead(10);
        uniqueList.addToHead(15);
        uniqueList.addToHead(20);
        uniqueList.deleteElement(100);
        uniqueList.deleteElement(10);
        uniqueList.deleteElement(15);
        uniqueList.deleteElement(30);
        uniqueList.deleteElement(20);
        uniqueList.deleteElement(1);
    }
}
