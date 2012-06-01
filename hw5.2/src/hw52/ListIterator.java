package hw52;

import java.util.Iterator;

interface ListIterator<ElementType> extends Iterator<ElementType> {

    public ElementType previous();

    public boolean hasPrevious();
}
