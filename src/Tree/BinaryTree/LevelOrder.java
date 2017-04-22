package Tree.BinaryTree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Hotown on 17/4/22.
 */
public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> base = new ArrayList<>();

            int len = queue.size(); //记录该层节点的总个数

            /**
             * 用循环将该层所有节点出队，并将所有的子节点入队
             */
            for (int i = 0; i < len; i++) {
                TreeNode tmp = queue.poll();
                base.add(tmp.val);  //将该层节点放入数组
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }

            result.add(base);
        }
        return result;
    }
}
