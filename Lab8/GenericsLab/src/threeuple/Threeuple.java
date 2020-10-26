package threeuple;

public class Threeuple<F, S, T>{
    private F first;
    private S second;
    private T third;

    public Threeuple(F item1, S item2, T item3) {
        this.first = item1;
        this.second = item2;
        this.third = item3;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    @Override
    public String toString() {
        return this.getFirst() + " -> " + this.getSecond() + " -> " + this.getThird();
    }
}
