package Utils;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Hotown on 17/4/22.
 */
public class TreeNodeInit {
    /**
     * 用二叉树层次遍历，初始化二叉树
     *
     * @param nodes：A list of integers.
     * @return root of the new tree.
     */
    public TreeNode initialize(int nodes[]) {
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        TreeNode root = new TreeNode(nodes[0]);
        queue.add(root);
        int i = 1;
        while (i < nodes.length) {
            TreeNode node = queue.poll();
            if (nodes[i] != 0) {
                node.left = new TreeNode(nodes[i]);
                queue.add(node.left);
            }
            if (i + 1 >= nodes.length) {
                break;
            }
            if (nodes[i + 1] != 0) {
                node.right = new TreeNode(nodes[i + 1]);
                queue.add(node.right);
            }
            //i每次加2，目的是为了移动到每个root的左孩子节点
            i += 2;
        }
        return root;
    }
}
