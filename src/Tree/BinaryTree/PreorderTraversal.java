package Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Hotown on 17/4/15.
 */
public class PreorderTraversal {
    class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public ArrayList<Integer> preorderTraversalSolution(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<Integer>();

        if (root == null) {
            return (ArrayList<Integer>) preorder;
        }

        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            preorder.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return (ArrayList<Integer>) preorder;
    }
}
