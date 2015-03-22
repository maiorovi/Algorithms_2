package firstweek;

import java.util.Iterator;

public class Bag<T> implements Iterable {

    private T[] container;
    private int pointer;

    public Bag() {
        container = (T[]) new Object[10];
    }

    public void put(T item) {
        container[pointer++] = item;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int size() {
        return pointer;
    }

    @Override
    public Iterator iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<T> {
        private int p = 0;
        private int lenght = pointer;

        @Override
        public boolean hasNext() {
            return p < lenght;
        }

        @Override
        public T next() {
            return container[p++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
