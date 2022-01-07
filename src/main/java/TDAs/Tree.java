package TDAs;

import java.util.LinkedList;

public class Tree<T> {

    NodeTree<T> root;

    public Tree(NodeTree<T> root) {
        this.root = root;
    }

    public Tree(T content) {
        this.root = new NodeTree<T>(content);
    }

    public Tree() {
        this.root = null;
    }

    public NodeTree<T> getRoot() {
        return root;
    }

    public T getRootContent() {
        return root.content;
    }

    public void setRoot(NodeTree<T> root) {
        this.root = root;
    }

    public void setRoot(T content) {
        this.root = new NodeTree<T>(content);
    }

    public LinkedList<Tree<T>> getChildren() {
        return root.getChildren();
    }

    public void addChild(T content) {
        root.getChildren().add(new Tree<T>(content));
    }

    public void addChild(Tree<T> tree) {
        root.getChildren().add(tree);
    }

    public boolean isEmpty() {
        return this == null || this.root == null;
    }

    public boolean isLeaf() {
        return this.root.getChildren() == null;
    }

    public Tree<T> getChild(int index) {
        return this.root.getChildren().get(index);
    }

}
