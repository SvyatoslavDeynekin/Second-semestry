/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Славес
 */
public class Pair {

    public Pair(float first, float second) {
        a = first;
        b = second;

    }

    public Pair multiplication(float x) {
        Pair pair = new Pair(a, b);
        pair.a *= x;
        pair.b *= x;
        return pair;
    }

    public Pair summary(Pair p2) {
        return new Pair(a + p2.a, b + p2.b);
    }

    public float getFirst() {
        return a;
    }

    public float getSecond() {
        return b;
    }
    protected float a;
    protected float b;
}
