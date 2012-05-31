package task_3;

public class HashTable {

    public HashTable() {
        for (int i = 0; i < hashSize; i++) {
            mass[i] = new List();
        }
    }

    public void addHash(String str) {
        int i = hashFunction(str) % hashSize;
        mass[i].addToEnd(str);
    }

    public void printHash() {
        for (int i = 0; i < hashSize; i++) {
            System.out.print(i + " ");
            mass[i].printList();
            System.out.println(" ");
        }
    }

    public boolean isInHashTable(String str) {
        int i = hashFunction(str) % hashSize;
        return mass[i].searchForElement(str);
    }

    public void deleteElement(String str) {
        int i = hashFunction(str) % hashSize;
        mass[i].deleteElement(str);
    }
    private int p = 13;
    private int hashSize = 100;
    private List[] mass = new List[hashSize];

    private int hashFunction(String str) {
        int hashCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char[] str1 = str.toCharArray();
            hashCount = hashCount * p + str1[i];
        }
        return hashCount;
    }
}
