package Tree.BinaryTree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Hotown on 17/6/17.
 */

/**
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */
public class LevelOrderBottom {
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();
            ArrayList<Integer> tempValueList = new ArrayList<Integer>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.remove();
                tempList.add(node);
                tempValueList.add(node.val);
            }
            list.add(tempValueList);

            for (int i = 0; i < tempList.size(); ++i) {
                TreeNode node = tempList.get(i);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; --i) {
            result.add(list.get(i));
        }
        return result;
    }
}
