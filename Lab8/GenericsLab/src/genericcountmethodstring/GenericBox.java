package genericcountmethodstring;

public class GenericBox<T> {

    private T element;

    public GenericBox(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getElement().getClass().getCanonicalName(), getElement());
    }
}
