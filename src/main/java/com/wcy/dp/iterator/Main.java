package com.wcy.dp.iterator;

import com.wcy.dp.iterator.impl.ArrayList_;
import com.wcy.dp.iterator.impl.LinkedList_;

public class Main {
    public static void main(String[] args) {
        Collections_<String> arrayList = new ArrayList_<String>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(String.valueOf(i));
        }
        Iterator_<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections_<String> linkedList = new LinkedList_<String>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(String.valueOf(i));
        }
        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
