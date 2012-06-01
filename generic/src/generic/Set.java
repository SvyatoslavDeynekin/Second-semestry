package generic;

public class Set<T> {

    private class SetValue {

        private T value;
        private SetValue next;

        public SetValue(T value, SetValue next) {
            this.value = value;
            this.next = next;
        }
    }

    public T getValue() {
        return first.value;
    }
    private SetValue first;

    public void Set() {
        first = null;
    }

    public boolean findValue(T symbol) {
        if (first == null) {
            return false;
        }
        SetValue list = first;
        while (list.value != symbol) {
            if (list.next == null) {
                return false;
            }
            list = list.next;
        }
        return true;
    }

    public void deleteValue(T symbol) throws Exception {
        if (findValue(symbol)) {
            SetValue list = first;
            SetValue list1 = first;
            while (list.value != symbol) {
                list1 = list;
                list = list.next;
            }
            if (list == first) {
                first = first.next;
            } else {
                list1.next = list.next;
            }
        } else {
            throw new Exception("Такого элемента множество не содержит\n");
        }
    }

    public void addValue(T symbol) throws Exception {
        if (findValue(symbol)) {
            throw new Exception("Такой элемент уже существует\n");
        }
        SetValue list1 = new SetValue(symbol, first);
        list1.next = first;
        first = list1;
    }

    public void printList() {
        if (first == null) {
            System.out.print("Список пуст");
        }
        SetValue list1 = first;
        while (list1 != null) {
            System.out.print(list1.value + " ");
            list1 = list1.next;
        }
    }

    public void Intersection(Set<T> second) throws Exception {
        while (second.first != null) {
            T symbol = second.getValue();
            if (findValue(symbol)) {
                System.out.print(symbol + " ");
                deleteValue(symbol);
            }
            if (second.first != null) {
                second.first = second.first.next;
            }
        }
    }

    public void Unification(Set<T> second) throws Exception {
        printList();
        while (second.first != null) {
            T symbol = second.getValue();
            if (findValue(symbol)) {
                deleteValue(symbol);
            } else {
                System.out.print(symbol + " ");
            }
            if (second.first != null) {
                second.first = second.first.next;
            }
        }
    }
}
