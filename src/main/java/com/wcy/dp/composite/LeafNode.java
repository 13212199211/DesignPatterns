package com.wcy.dp.composite;

public class LeafNode implements Node {

    private String data;

    public LeafNode(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println(data);
    }
}
