package hw52;

public class UniqueList<ElementType> extends List<ElementType> {

    @Override
    public void insert(int index, ElementType value) throws ExistException {
        checkForExistance(value);
        super.insert(index, value);
    }

    @Override
    public void addToHead(ElementType value) throws ExistException {
        checkForExistance(value);
        super.addToHead(value);
    }

    @Override
    public void addToEnd(ElementType value) throws ExistException {
        checkForExistance(value);
        super.addToEnd(value);
    }

    private void checkForExistance(ElementType value) throws ExistException {
        if (exist(value)) {
            throw new ExistException();
        }
    }
}