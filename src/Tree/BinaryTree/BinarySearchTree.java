package Tree.BinaryTree;

/**
 * Created by Hotown on 17/8/15.
 */


public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;

    //inner class
    private class Node {
        private Node left, right;
        private Key key;
        private Value value;
        int n;  //子树节点数量

        Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            this.n = n;
        }
    }

    public int size() {
        return root.n;
    }

    public int size(Node node) {
        if (node == null) {
            return -1;
        } else {
            return root.n;
        }
    }

    public Node get(Key key) {
        return get(key, root);
    }

    private Node get(Key key, Node root) {
        if (root == null) {
            return null;
        }

        if (key.compareTo(root.key) == 0) {
            return root;
        } else if (key.compareTo(root.key) < 0) {
            return get(key, root.left);
        } else {
            return get(key, root.right);
        }
    }
}
