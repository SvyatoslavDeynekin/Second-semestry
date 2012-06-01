package hw52;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class List<ElementType> implements Iterable<ElementType> {

    public void insert(int index, ElementType value) throws ExistException {
        if (index > size - 1) {
            throw new ListIndexOutOfBoundsException();
        }

        if (size == 0) {
            addFirstElement(value);
        } else if (index == size - 1) {
            addToEnd(value);
        } else {
            ListElement temp = head;

            for (int i = 0; i < index; ++i) {
                temp = temp.next;
            }
            ListElement newElement = new ListElement(value, temp.next, temp);
            temp.next.previous = newElement;
            temp.next = newElement;
            size++;
        }
    }

    public void addToEnd(ElementType value) throws ExistException {
        if (size == 0) {
            addFirstElement(value);
        } else {
            ListElement newElement = new ListElement(value, null, tail);
            tail.next = newElement;
            tail = newElement;
            size++;
        }
    }

    public void addToHead(ElementType value) throws ExistException {
        if (size == 0) {
            addFirstElement(value);
        } else {
            ListElement newElement = new ListElement(value, head, null);
            head.previous = newElement;
            head = newElement;
            size++;
        }
    }

    public boolean exist(ElementType value) {
        ListElement temp = head;

        while (temp != null) {
            if (temp.value.equals(value)) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void deleteElement(ElementType value) throws NotFound {
        if (!exist(value)) {
            throw new NotFound();
        }

        if (head.value.equals(value)) {
            head = head.next;
        } else {
            ListElement temp = head.next;

            while (temp != null) {
                if (temp.value.equals(value)) {
                    break;
                }
                temp = temp.next;
            }

            temp.previous.next = temp.previous.next.next;
        }
    }

    public int amountElements() {
        return size;
    }

    @Override
    public ListIterator<ElementType> iterator() {
        return new ListIter();
    }

    public class ListIter implements ListIterator<ElementType> {

        public ListIter() {
            this.position = head;
            this.index = 1;
        }

        @Override
        public ElementType next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            if (index < 1) {
                position = head;
                index++;
                return null;
            } else {
                ListElement temp = position;
                position = position.next;
                index++;
                return temp.value;
            }
        }

        @Override
        public ElementType previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }

            if (index > size) {
                position = tail;
                index--;
                return null;
            } else {
                ListElement temp = position;
                position = position.previous;
                index--;
                return temp.value;
            }
        }

        @Override
        public boolean hasNext() {
            return index < size + 1;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public void remove() {
            if (position == null) {
                throw new IllegalStateException();
            }

            if (size == 1) {
                head = null;
                tail = null;
                position = null;
                index = 0;
            } else if (position == head) {
                position.next.previous = null;
                head = position.next;
                position = position.next;
            } else if (position == tail) {
                position.previous.next = null;
                tail = position.previous;
                position = position.previous;
                index--;
            } else {
                position.previous.next = position.next;
                position.next.previous = position.previous;
                position = position.next;
            }
            size--;
        }
        private ListElement position;
        private int index;
    }

    private void addFirstElement(ElementType value) {
        ListElement newElement = new ListElement(value, null, null);
        head = newElement;
        tail = newElement;
        size = 1;
    }

    private class ListElement {

        private ListElement(ElementType value, ListElement next, ListElement previous) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
        private ElementType value;
        private ListElement next;
        private ListElement previous;
    }
    private ListElement head;
    private ListElement tail;
    private int size;
}
