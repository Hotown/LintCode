package Tree.BinaryTree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class IsValidBST {
    /*
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        TreeNode p = root;
        while(p != null || !stack.empty()) {
            while(p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.peek();
            stack.pop();
            res.add(p.val);
            p = p.right;
        }

        boolean flag = true;

        for (int i = 0; i < res.size()-1; i++) {
            if (res.get(i) >= res.get(i+1)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
