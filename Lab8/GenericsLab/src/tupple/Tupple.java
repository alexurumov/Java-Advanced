package tupple;

public class Tupple<F, S> {
    private F first;
    private S second;

    public Tupple(F item1, S item2) {
        this.first = item1;
        this.second = item2;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return this.first + " -> " + this.second;
    }
}
