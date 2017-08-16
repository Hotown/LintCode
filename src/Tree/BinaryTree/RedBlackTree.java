package Tree.BinaryTree;

/**
 * Created by Hotown on 17/8/16.
 * 红黑树实现
 */
public class RedBlackTree<Key extends Comparable<Key>, Value> {
    private static final boolean red = true;
    private static final boolean black = false;
    private Node root;

    private class Node {
        private Node right;
        private Node left;
        private Key key;
        private Value value;
        int n;  //子节点个数
        boolean color;

        public Node(Key key, Value value, int n, boolean color) {
            this.key = key;
            this.value = value;
            this.n = n;
            this.color = color;
        }
    }

    public boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color == red;
    }

    public Value getValue(Key key) {
        return getValue(root, key);
    }

    private Value getValue(Node node, Key key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) == 0) {
            return node.value;
        } else if (key.compareTo(node.key) < 0) {
            return getValue(node.left, key);
        } else {
            return getValue(node.right, key);
        }
    }

    // 左旋操作
    private Node rotateLeft(Node h) {
        Node x = h.right;
        //将x的左节点复制给右节点
        h.right = x.left;
        //将h复制给x左节点
        x.left = h;
        x.color = h.color;
        h.color = red;
        return x;
    }

    // 右旋操作
    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = red;
        return x;
    }

    //状态提升
    private Node flipColor(Node h) {
        h.left.color = black;
        h.right.color = black;
        h.color = red;
        return h;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
        root.color = black;
    }

    private Node put(Node h, Key key, Value value) {
        if (h == null) {
            return new Node(key, value, 1, red);
        }

        if (key.compareTo(h.key) < 0) {
            h.left = put(h.left, key, value);
        } else if (key.compareTo(h.key) > 0) {
            h.right = put(h.right, key, value);
        } else {
            h.value = value;
        }

        /**
         * 平衡化处理：
         * 1. 如果节点的右节点为红，且左节点为黑，进行左旋操作。
         * 2. 如果节点的左节点为红，且左节点的左节点也为红，进行右旋操作。
         * 3. 如果节点的左右节点都为红，进行状态提升。
         */
        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            h = flipColor(h);
        }

        h.n = size(h.left) + size(h.right) + 1;
        return h;
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }

        return node.n;
    }
}
