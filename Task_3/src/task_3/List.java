package task_3;

public class List {

    public List() {
    }

    public boolean searchForElement(String value) {
        boolean isFound = false;
        ListElement index = head;
        if (index != null) {
            if (index.next == null && index.value.equals(value)) {
                isFound = true;
            } else {
                while (index.next != null) {
                    if (!index.value.equals(value)) {
                        index = index.next;
                    } else {
                        isFound = true;
                        break;
                    }
                }
            }
        }
        return isFound;
    }

    public void addToBegin(String j) {
        ListElement newEl = new ListElement(j);
        if (!isEmpty()) {
            newEl.next = head;
            head = newEl;
        } else {
            head = newEl;
            tail = newEl;
            newEl.next = null;
        }

    }

    public void addToEnd(String j) {
        ListElement newEl = new ListElement(j);
        if (isEmpty()) {
            head = newEl;
            tail = newEl;
            newEl.next = null;
        } else {
            newEl.next = null;
            tail.next = newEl;
            tail = newEl;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void deleteFromBegin() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Error. Is empty");
        }
    }

    public void deleteFromEnd() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                ListElement index = head;
                while (index.next.next != null) {
                    index = index.next;
                }
                index.next = null;
                tail = index;
            }
        } else {
            System.out.println("Error. Is empty");
        }
    }

    public void printList() {
        System.out.print("List: ");
        ListElement current = head;
        if (current == null) {
            System.out.println("Is empty");
        }
        while (current != null) {
            current.printListElement();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void deleteElement(String value) {
        ListElement index = head;
        if (index.value.equals(value)) {
            deleteFromBegin();
        } else {
            while (index.next != null) {
                if (index.next.value.equals(value)) {
                    index.next = index.next.next;
                } else {
                    index = index.next;
                }
            }
            if ((index.next == null) && (index.value.equals(value))) {
                deleteFromEnd();
            }
        }
    }

    public void addToPlace(String value, int number) {
        ListElement index = head;
        if (number == 1 || index == null) {
            addToBegin(value);
        }
        if ((number > 1) && (number <= numberOfElements())) {
            while (index.next != null) {
                for (int i = 1; i < number - 1; i++) {
                    index = index.next;
                }
                ListElement further = new ListElement(value);
                further.next = index.next;
                index.next = further;
                break;
            }
            if (index.next == null) {
                addToEnd(value);
            }
        }
        if (number == numberOfElements() + 1) {
            addToEnd(value);
        }
    }

    public int numberOfElements() {
        ListElement index = head;
        int count = 0;
        while (index != null) {
            index = index.next;
            count++;
        }
        return count;
    }
    private ListElement head;
    private ListElement tail;

    class ListElement {

        public ListElement(String n) {
            value = n;
        }

        public void printListElement() {
            System.out.print(value + " ");
        }
        private String value;
        private ListElement next;
    }
}
