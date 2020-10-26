package linkedlist;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.function.Consumer;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int[] toArray() {
        int[] result = new int[this.size];

        Node current = this.head;
        int index = 0;

        while (current != null) {
            result[index++] = current.getValue();
            current = current.next;
        }

        return result;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.head;
        while (current != null) {
            consumer.accept(current.value);
            current = current.next;
        }
    }

    public void addFirst(int elem) {
        Node node = new Node(elem);
        if (this.isEmpty()) {
            this.tail = node;
        } else {
            this.head.prev = node;
            node.next = this.head;
        }

        this.head = node;
        this.size++;
    }

    public void addLast(int elem) {
        Node node = new Node(elem);

        if (this.isEmpty()) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }
        this.tail = node;
        this.size++;
    }

    public void addAfter(int searchElem, int newElem) {
        if (this.isEmpty()) {
            throw new InvalidDnDOperationException("addAfter on empty list");
        }

        Node current = this.head;
        while (current != null) {
            if (current.value == searchElem) {

                Node node = new Node(newElem);

                node.next = current.next;
                node.prev = current;
                if (current.next != null) {
                    node.next.prev = node;
                } else {
                    this.tail = node;
                }
                current.next = node;

                this.size++;
                return;
            }

            current = current.next;
        }

        throw new InvalidDnDOperationException("Element not found");

    }

    public int removeFirstNode() {
        if (this.isEmpty()) {
            throw new InvalidDnDOperationException("Remove called for collection with size 0");
        }

        Node deleted = this.head;

        this.head = this.head.next;
        deleted.next = null;

        if (this.size == 1) {
            this.tail = null;
        } else {
            this.head.prev = null;
        }

        this.size--;

        return deleted.value;
    }

    public int removeLast() {

        if (this.isEmpty()) {
            throw new InvalidDnDOperationException("Remove called for collection with size 0");
        }

        Node deleted = this.tail;
        this.tail = this.tail.prev;
        deleted.prev = null;

        if (this.size == 1) {
            this.head = null;
        } else {
            this.tail.next = null;
        }

        this.size--;

        return deleted.value;
    }

    public int removeAfter(int searchElem) {
        if (this.isEmpty()) {
            throw new InvalidDnDOperationException("removeAfter on empty list");
        }

        Node current = this.head;

        while (current != null) {

            if (current.value == searchElem) {
                Node deleted = current.next;

                if (deleted == null) {
                    throw new InvalidDnDOperationException("no element after search element");
                }

                current.next = deleted.next;

                if (current.next != null) {
                    current.next.prev = current;
                }

                deleted.next = null;
                deleted.prev = null;

                return deleted.value;

            }

            current = current.next;
        }

        throw new InvalidDnDOperationException("Element not found");

    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
