package com.wcy.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode implements Node {
    private String data;
    private List<Node> nodes = new ArrayList<>();

    public void add(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public BranchNode(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println(data);
    }
}
