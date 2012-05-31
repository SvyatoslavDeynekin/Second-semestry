
package task_4;

public class HashFunction implements HashFucntionInterface {


    @Override
    public int hashFunction(String str) {
        int hashCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char[] str1 = str.toCharArray();
            hashCount = hashCount * 13 + str1[i];
        }
        return hashCount;
    }
}