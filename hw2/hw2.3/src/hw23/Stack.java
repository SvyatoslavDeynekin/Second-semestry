package hw23;

public class Stack {

    private StackElement head;

    private class StackElement {

        private int element;
        private StackElement nextElement;
    }

    public void push(int value) throws Exception {
        StackElement newElement = new StackElement();
        newElement.element = value;
        newElement.nextElement = head;
        head = newElement;
    }
   

    public int pop() throws Exception {
        int value;

        if (head != null) {
            value = head.element;
            head = head.nextElement;
            return value;
        } else {
            throw new Exception();
        }

    }
}

