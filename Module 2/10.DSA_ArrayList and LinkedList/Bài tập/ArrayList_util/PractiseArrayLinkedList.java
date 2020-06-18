package introductionJava.baitap;

import java.util.Arrays;

public class PractiseArrayLinkedList<E> {
    private int size = 0;
    private static final int Capacity = 2;
    private Object elements[];

    public PractiseArrayLinkedList() {
        elements = new Object[Capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void display(E e) {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(e);
        }
    }
}
