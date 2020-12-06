package com.wcy.dp.iterator.impl;

import com.wcy.dp.iterator.Collections_;
import com.wcy.dp.iterator.Iterator_;

public class ArrayList_<E> implements Collections_<E> {
    private int index = 0;
    private E[] list;


    public ArrayList_() {
        list = (E[]) new Object[16];
    }

    @Override
    public void add(E element) {
        if (index >= list.length) {
            increaseSize();
        }
        list[index++] = element;
    }

    private void increaseSize() {
        E[] newList = (E[]) new Object[list.length * 2];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayIterator<E>();
    }

    class ArrayIterator<E> implements Iterator_<E> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public E next() {
            return (E) list[index++];
        }
    }
}
