package customlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomList<T extends Comparable<T>> implements Iterable<T>{

    private ArrayList<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

//•	Add <element> - Adds the given element to the end of the list
    public void add(T element) {
        this.data.add(element);
    }

//•	Remove <index> - Removes the element at the given index
    public T remove (int index) {
        return this.data.remove(index);
    }

//•	Contains <element> - Prints if the list contains the given element (true or false)
    public boolean contains(T element) {
        return this.data.contains(element);
    }

//•	Swap <index> <index> - Swaps the elements at the given indexes
    public void swap(int firstIndex, int secondIndex) {
        T first = this.data.get(firstIndex);
        this.data.set(firstIndex, this.data.get(secondIndex));
        this.data.set(secondIndex, first);
    }

//•	Greater <element> - Counts the elements that are greater than the given element and prints their count
    public int greater(T element) {
        return this.data.stream().filter(e -> e.compareTo(element) > 0).toArray().length;
    }

//•	Max - Prints the maximum element in the list
    public T getMax() {
        return this.data.stream().max(T::compareTo).get();
    }

//•	Min - Prints the minimum element in the list
    public T getMin() {
        return this.data.stream().min(T::compareTo).get();
    }

//•	Print - Prints all elements in the list, each on a separate line


    public int size() {
        return this.data.size();
    }

    public T get(int index) {
        return this.data.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return this.data.iterator();
    }
}
