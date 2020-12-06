package com.wcy.dp.composite;

/**
 * 复合模式
 */
public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode branchNode01 = new BranchNode("br01");
        BranchNode branchNode02 = new BranchNode("br02");
        BranchNode branchNode03 = new BranchNode("br03");

        Node leafNode01 = new LeafNode("lf01");
        Node leafNode02 = new LeafNode("lf02");
        Node leafNode03 = new LeafNode("lf03");
        Node leafNode04 = new LeafNode("lf04");

        root.add(branchNode01);
        root.add(branchNode02);
        branchNode02.add(branchNode03);
        branchNode01.add(branchNode02);
        branchNode01.add(leafNode01);
        branchNode02.add(leafNode02);
        branchNode03.add(leafNode03);
        root.add(leafNode04);

        tree(root, 1);
    }


    private static void tree(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        node.print();
        if (node instanceof BranchNode) {
            for (Node curNode : ((BranchNode) node).getNodes()) {
                tree(curNode, level + 1);
            }
        }


    }
}
