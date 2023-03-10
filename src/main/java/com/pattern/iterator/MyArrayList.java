package com.pattern.iterator;

import java.util.NoSuchElementException;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-7
 */
public class MyArrayList<E> implements MyList<E> {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public boolean add(E ele) {
        if (size >= elements.length) {
            Object[] tempArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, tempArray, 0, elements.length);
            elements = tempArray;
        }
        elements[size] = ele;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        return ((E) elements[index]);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator<E> iterator() {
        return new DefaultIterator();
    }

    class DefaultIterator implements MyIterator<E> {

        private int position;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public E getNext() {
            if (position >= size) {
                throw new NoSuchElementException();
            }
            return (E) elements[position++];
        }
    }
}
