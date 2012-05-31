package hw24;

public class List {

    private class ListElement {

        public ListElement(int value, ListElement next) {
            this.value = value;
            this.next = next;
        }
        private int value;
        private ListElement next;
    }

    public List() {
        firstElement = null;
    }

    public void AddElement(int value) {
        ListElement newElement = new ListElement(value, null);
        if (firstElement == null) {
            firstElement = newElement;
        } else {
            ListElement pointer = firstElement;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newElement;
        }
    }

    public void DeleteElement(int value) {
        if (firstElement == null) {
            System.out.print("List is empty; \n");
        } else {
            if (firstElement.value == value) {
                if (firstElement.next != null) {
                    firstElement = firstElement.next;
                } else {
                    firstElement = null;
                }
            } else {
                ListElement pointer = firstElement;
                while ((pointer.next.value != value) && (pointer != null)) {
                    pointer = pointer.next;
                }
                pointer.next = pointer.next.next;
            }
        }
    }

    public void PrintList() {
        if (firstElement == null) {
            System.out.print("List is empty; \n");
        } else {
            ListElement pointer = firstElement;
            while (pointer != null) {
                System.out.print(pointer.value + " ");
                pointer = pointer.next;
            }
            System.out.print("\n");
        }
    }
    private ListElement firstElement;
}

