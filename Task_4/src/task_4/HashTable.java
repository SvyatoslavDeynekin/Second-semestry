package task_4;

import java.util.ArrayList;

public class HashTable {

    public HashTable(HashFucntionInterface hashFunc) {
        for (int i = 0; i < hashSize; i++) {
            mass[i] = new ArrayList();
        }
        hashFunction = hashFunc;
    }

    public void addHash(String str) {
        int i = hashFunction.hashFunction(str) % hashSize;
        mass[i].add(str);
    }

    public boolean isInHashTable(String str) {
        int i = hashFunction.hashFunction(str) % hashSize;
        return mass[i].contains(str);
    }

    public void deleteElement(String str) {
        int i = hashFunction.hashFunction(str) % hashSize;
        mass[i].remove(str);
    }

    public void changeHashFunction(HashFucntionInterface newFunction) {
        ArrayList[] mass1 = new ArrayList[hashSize];
        for (int k = 0; k < hashSize; ++k) {
            mass1[k] = new ArrayList();
        }
        for (int i = 0; i < hashSize; i++) {
            for (Object elem : mass[i]) {
                int j = newFunction.hashFunction(elem.toString()) % hashSize;
                mass1[j].add(elem);
            }
        }
        System.arraycopy(mass1, 0, mass, 0, hashSize);
        hashFunction = newFunction;
    }
    private int hashSize = 100;
    private ArrayList[] mass = new ArrayList[hashSize];
    private HashFucntionInterface hashFunction;
}
