package com.wcy.dp.iterator.impl;

import com.wcy.dp.iterator.Collections_;
import com.wcy.dp.iterator.Iterator_;

public class LinkedList_<E> implements Collections_<E> {
    private Node<E> tail;
    private Node<E> head;
    private int size = 0;


    @Override
    public void add(E element) {
        if (head == null) {
            head = new Node<E>(element, null);
            tail = head;
            size++;
            return;
        }
        Node<E> curNode = new Node<E>(element, null);
        tail.next = curNode;
        tail = curNode;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_<E> iterator() {
        return new LinkedIterator<E>();
    }

    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    class LinkedIterator<E> implements Iterator_<E> {
        private int curIndex = 0;

        @Override
        public boolean hasNext() {
            return curIndex < size;
        }

        @Override
        public E next() {
            Node retNode = head;
            for (int i = 0; i < curIndex; i++) {
                retNode = retNode.next;
            }
            curIndex++;
            return (E) retNode.data;
        }
    }
}
