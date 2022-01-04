package TDAs;

import java.util.LinkedList;

public class NodeTree<T> {

    T content;
    LinkedList<Tree<T>> children;

    public NodeTree() {
        this.content = null;
        this.children = new LinkedList<>();
    }

    public NodeTree(T content) {
        this.content = content;
        this.children = new LinkedList<>();
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public LinkedList<Tree<T>> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Tree<T>> children) {
        this.children = children;
    }

}
